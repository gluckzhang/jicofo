#!/bin/bash

JAVA_SYS_PROPS="-Dnet.java.sip.communicator.SC_HOME_DIR_LOCATION=/ -Dnet.java.sip.communicator.SC_HOME_DIR_NAME=config -Djava.util.logging.config.file=/config/logging.properties"

JVM_OPTS="--add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens java.base/jdk.internal.module=ALL-UNNAMED --add-opens java.base/java.lang.module=ALL-UNNAMED --add-opens java.base/jdk.internal.util.jar=ALL-UNNAMED"
GLOWROOT_OPTS="-javaagent:/home/jicofo/glowroot/glowroot.jar"
JACOCO_OPTS="-javaagent:/home/jicofo/jacocoagent.jar=output=tcpserver,address=*,port=33333"

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

JAVA_SYS_PROPS=$JAVA_SYS_PROPS java $JVM_OPTS $GLOWROOT_OPTS $JACOCO_OPTS -Xmx$JICOFO_MAX_MEMORY -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Djdk.tls.ephemeralDHKeySize=2048 $LOGGING_CONFIG_PARAM $JAVA_SYS_PROPS -cp $cp $mainClass $JICOFO_OPTS