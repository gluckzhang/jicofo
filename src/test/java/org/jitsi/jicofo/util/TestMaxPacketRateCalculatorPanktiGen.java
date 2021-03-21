package org.jitsi.jicofo.util;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestMaxPacketRateCalculatorPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObject(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObject(File serializedObjectFile) throws Exception {
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @Test
    public void testComputeSenderIngressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
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
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(490, receivingObject.computeSenderIngressPacketRatePps());
    }

    @Test
    public void testComputeIngressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
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
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(9800, receivingObject.computeIngressPacketRatePps());
    }

    @Test
    public void testComputeParticipantEgressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
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
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(1640, receivingObject.computeParticipantEgressPacketRatePps());
    }

    @Test
    public void testComputeEgressPacketRatePps1() throws Exception {
        String receivingObjectStr = 
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
        org.jitsi.jicofo.util.MaxPacketRateCalculator receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(41000, receivingObject.computeEgressPacketRatePps());
    }
}