package org.jitsi.jicofo;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestJitsiMeetConfigPanktiGen {
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
    public void testUseRoomAsSharedDocName1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.useRoomAsSharedDocName());
    }

    @Test
    public void testIsLipSyncEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.isLipSyncEnabled());
    }

    @Test
    public void testGetMinParticipants1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(2, receivingObject.getMinParticipants());
    }

    @Test
    public void testIsOctoEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isOctoEnabled());
    }

    @Test
    public void testGetStartAudioMuted1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getStartAudioMuted());
    }

    @Test
    public void testGetStartVideoMuted1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getStartVideoMuted());
    }

    @Test
    public void testGetEnforcedVideobridge1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getEnforcedVideobridge());
    }

    @Test
    public void testGetChannelLastN1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getChannelLastN());
    }

    @Test
    public void testGetAudioPacketDelay1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getAudioPacketDelay());
    }

    @Test
    public void testGetStartBitrate1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(800, receivingObject.getStartBitrate());
    }

    @Test
    public void testIsRembEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isRembEnabled());
    }

    @Test
    public void testIsRtxEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(true, receivingObject.isRtxEnabled());
    }

    @Test
    public void testStereoEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.stereoEnabled());
    }

    @Test
    public void testGetOpusMaxAverageBitrate1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(-1, receivingObject.getOpusMaxAverageBitrate());
    }

    @Test
    public void testIsTccEnabled1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(true, receivingObject.isTccEnabled());
    }

    @Test
    public void testGetMinBitrate1() throws Exception {
        String receivingObjectStr = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties/>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(-1, receivingObject.getMinBitrate());
    }
}