#!/bin/bash

JAVA_SYS_PROPS="-Dnet.java.sip.communicator.SC_HOME_DIR_LOCATION=/ -Dnet.java.sip.communicator.SC_HOME_DIR_NAME=config -Djava.util.logging.config.file=/config/logging.properties"

JICOFO_OPTS="--domain=$XMPP_DOMAIN --host=$XMPP_SERVER --secret=$JICOFO_COMPONENT_SECRET --user_name=$JICOFO_AUTH_USER --user_domain=$XMPP_AUTH_DOMAIN --user_password=$JICOFO_AUTH_PASSWORD"

SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"

mainClass="org.jitsi.jicofo.Main"
cp=$(JARS=($SCRIPT_DIR/jicofo*.jar $SCRIPT_DIR/lib/*.jar); IFS=:; echo "${JARS[*]}")
logging_config="$SCRIPT_DIR/lib/logging.properties"

# if there is a logging config file in lib folder use it (running from source)
if [ -f $logging_config ]; then
    LOGGING_CONFIG_PARAM="-Djava.util.logging.config.file=$logging_config"
fi

if [ -z "$JICOFO_MAX_MEMORY" ]; then JICOFO_MAX_MEMORY=3072m; fi

JAVA_SYS_PROPS=$JAVA_SYS_PROPS java -javaagent:/home/jicofo/jacocoagent.jar=output=tcpserver,address=*,port=33333 -Xmx$JICOFO_MAX_MEMORY -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Djdk.tls.ephemeralDHKeySize=2048 $LOGGING_CONFIG_PARAM $JAVA_SYS_PROPS -cp $cp $mainClass $JICOFO_OPTS