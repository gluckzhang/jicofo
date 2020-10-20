package org.jitsi.jicofo.util;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import org.junit.Assert;
import org.junit.Test;
public class TestMaxPacketRateCalculatorPanktiGen {
    static XStream xStream = new XStream(new JettisonMappedXmlDriver());

    @Test
    public void testComputeSenderIngressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.util.MaxPacketRateCalculator\":{\"numberOfConferenceBridges\":4,\"numberOfGlobalSenders\":20,\"numberOfSpeakers\":2,\"numberOfLocalSenders\":20,\"numberOfLocalReceivers\":5,\"maxPacketRatePps\":{\"int\":[50,70,90,280]}}}";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(490, receivingObject.computeSenderIngressPacketRatePps());
    }

    @Test
    public void testComputeIngressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.util.MaxPacketRateCalculator\":{\"numberOfConferenceBridges\":4,\"numberOfGlobalSenders\":20,\"numberOfSpeakers\":2,\"numberOfLocalSenders\":20,\"numberOfLocalReceivers\":5,\"maxPacketRatePps\":{\"int\":[50,70,90,280]}}}";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(9800, receivingObject.computeIngressPacketRatePps());
    }

    @Test
    public void testComputeParticipantEgressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.util.MaxPacketRateCalculator\":{\"numberOfConferenceBridges\":4,\"numberOfGlobalSenders\":20,\"numberOfSpeakers\":2,\"numberOfLocalSenders\":20,\"numberOfLocalReceivers\":5,\"maxPacketRatePps\":{\"int\":[50,70,90,280]}}}";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(1640, receivingObject.computeParticipantEgressPacketRatePps());
    }

    @Test
    public void testComputeEgressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.util.MaxPacketRateCalculator\":{\"numberOfConferenceBridges\":4,\"numberOfGlobalSenders\":20,\"numberOfSpeakers\":2,\"numberOfLocalSenders\":20,\"numberOfLocalReceivers\":5,\"maxPacketRatePps\":{\"int\":[50,70,90,280]}}}";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(41000, receivingObject.computeEgressPacketRatePps());
    }
}