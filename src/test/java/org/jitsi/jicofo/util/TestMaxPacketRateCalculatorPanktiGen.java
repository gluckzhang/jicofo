package org.jitsi.jicofo.util;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestMaxPacketRateCalculatorPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testComputeSenderIngressPacketRatePps1() throws Exception {
        String receivingXML = 
        "<org.jitsi.jicofo.util.MaxPacketRateCalculator>" +
        "  <numberOfConferenceBridges>4</numberOfConferenceBridges>" +
        "  <numberOfGlobalSenders>20</numberOfGlobalSenders>" +
        "  <numberOfSpeakers>2</numberOfSpeakers>" +
        "  <numberOfLocalSenders>20</numberOfLocalSenders>" +
        "  <numberOfLocalReceivers>5</numberOfLocalReceivers>" +
        "  <maxPacketRatePps>" +
        "    <int>50</int>" +
        "    <int>70</int>" +
        "    <int>90</int>" +
        "    <int>280</int>" +
        "  </maxPacketRatePps>" +
        "</org.jitsi.jicofo.util.MaxPacketRateCalculator>";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingXML);
        Assert.assertEquals(490, receivingObject.computeSenderIngressPacketRatePps());
    }

    @Test
    public void testComputeIngressPacketRatePps1() throws Exception {
        String receivingXML = 
        "<org.jitsi.jicofo.util.MaxPacketRateCalculator>" +
        "  <numberOfConferenceBridges>4</numberOfConferenceBridges>" +
        "  <numberOfGlobalSenders>20</numberOfGlobalSenders>" +
        "  <numberOfSpeakers>2</numberOfSpeakers>" +
        "  <numberOfLocalSenders>20</numberOfLocalSenders>" +
        "  <numberOfLocalReceivers>5</numberOfLocalReceivers>" +
        "  <maxPacketRatePps>" +
        "    <int>50</int>" +
        "    <int>70</int>" +
        "    <int>90</int>" +
        "    <int>280</int>" +
        "  </maxPacketRatePps>" +
        "</org.jitsi.jicofo.util.MaxPacketRateCalculator>";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingXML);
        Assert.assertEquals(9800, receivingObject.computeIngressPacketRatePps());
    }

    @Test
    public void testComputeParticipantEgressPacketRatePps1() throws Exception {
        String receivingXML = 
        "<org.jitsi.jicofo.util.MaxPacketRateCalculator>" +
        "  <numberOfConferenceBridges>4</numberOfConferenceBridges>" +
        "  <numberOfGlobalSenders>20</numberOfGlobalSenders>" +
        "  <numberOfSpeakers>2</numberOfSpeakers>" +
        "  <numberOfLocalSenders>20</numberOfLocalSenders>" +
        "  <numberOfLocalReceivers>5</numberOfLocalReceivers>" +
        "  <maxPacketRatePps>" +
        "    <int>50</int>" +
        "    <int>70</int>" +
        "    <int>90</int>" +
        "    <int>280</int>" +
        "  </maxPacketRatePps>" +
        "</org.jitsi.jicofo.util.MaxPacketRateCalculator>";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingXML);
        Assert.assertEquals(1640, receivingObject.computeParticipantEgressPacketRatePps());
    }

    @Test
    public void testComputeEgressPacketRatePps1() throws Exception {
        String receivingXML = 
        "<org.jitsi.jicofo.util.MaxPacketRateCalculator>" +
        "  <numberOfConferenceBridges>4</numberOfConferenceBridges>" +
        "  <numberOfGlobalSenders>20</numberOfGlobalSenders>" +
        "  <numberOfSpeakers>2</numberOfSpeakers>" +
        "  <numberOfLocalSenders>20</numberOfLocalSenders>" +
        "  <numberOfLocalReceivers>5</numberOfLocalReceivers>" +
        "  <maxPacketRatePps>" +
        "    <int>50</int>" +
        "    <int>70</int>" +
        "    <int>90</int>" +
        "    <int>280</int>" +
        "  </maxPacketRatePps>" +
        "</org.jitsi.jicofo.util.MaxPacketRateCalculator>";
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = (org.jitsi.jicofo.util.MaxPacketRateCalculator) xStream.fromXML(receivingXML);
        Assert.assertEquals(41000, receivingObject.computeEgressPacketRatePps());
    }
}