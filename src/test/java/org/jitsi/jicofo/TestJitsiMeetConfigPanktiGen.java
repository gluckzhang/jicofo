package org.jitsi.jicofo;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestJitsiMeetConfigPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testUseRoomAsSharedDocName1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.useRoomAsSharedDocName());
    }

    @Test
    public void testIsLipSyncEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        java.lang.Boolean expectedObject = (java.lang.Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.isLipSyncEnabled());
    }

    @Test
    public void testIsOctoEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isOctoEnabled());
    }

    @Test
    public void testGetMinParticipants1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>2</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(2, receivingObject.getMinParticipants());
    }

    @Test
    public void testGetStartAudioMuted1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getStartAudioMuted());
    }

    @Test
    public void testGetStartVideoMuted1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getStartVideoMuted());
    }

    @Test
    public void testGetEnforcedVideobridge1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.jxmpp.jid.Jid expectedObject = (org.jxmpp.jid.Jid) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEnforcedVideobridge());
    }

    @Test
    public void testGetChannelLastN1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getChannelLastN());
    }

    @Test
    public void testGetAudioPacketDelay1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getAudioPacketDelay());
    }

    @Test
    public void testIsRtxEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.isRtxEnabled());
    }

    @Test
    public void testStereoEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.stereoEnabled());
    }

    @Test
    public void testGetOpusMaxAverageBitrate1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(-1, receivingObject.getOpusMaxAverageBitrate());
    }

    @Test
    public void testIsTccEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.isTccEnabled());
    }

    @Test
    public void testGetMinBitrate1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>-1</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(-1, receivingObject.getMinBitrate());
    }

    @Test
    public void testGetStartBitrate1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>800</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(800, receivingObject.getStartBitrate());
    }

    @Test
    public void testIsRembEnabled1() {
        String receivingXML = 
        "<org.jitsi.jicofo.JitsiMeetConfig>" +
        "  <properties>" +
        "    <entry>" +
        "      <string>channelLastN</string>" +
        "      <string>-1</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>enableLipSync</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>openSctp</string>" +
        "      <string>true</string>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>disableRtx</string>" +
        "      <string>false</string>" +
        "    </entry>" +
        "  </properties>" +
        "</org.jitsi.jicofo.JitsiMeetConfig>";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isRembEnabled());
    }
}