package org.jitsi.jicofo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import org.junit.Assert;
import org.junit.Test;
public class TestJitsiMeetConfigPanktiGen {
    static XStream xStream = new XStream(new JettisonMappedXmlDriver());

    @Test
    public void testUseRoomAsSharedDocName1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.useRoomAsSharedDocName());
    }

    @Test
    public void testIsLipSyncEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"boolean\":false}";
        java.lang.Boolean expectedObject = (java.lang.Boolean) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.isLipSyncEnabled());
    }

    @Test
    public void testIsOctoEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isOctoEnabled());
    }

    @Test
    public void testGetMinParticipants1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(2, receivingObject.getMinParticipants());
    }

    @Test
    public void testGetStartAudioMuted1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"null\":\"\"}";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(null, receivingObject.getStartAudioMuted());
    }

    @Test
    public void testGetStartVideoMuted1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"null\":\"\"}";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(null, receivingObject.getStartVideoMuted());
    }

    @Test
    public void testGetEnforcedVideobridge1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"null\":\"\"}";
        org.jxmpp.jid.Jid expectedObject = (org.jxmpp.jid.Jid) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(null, receivingObject.getEnforcedVideobridge());
    }

    @Test
    public void testGetChannelLastN1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"int\":-1}";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getChannelLastN());
    }

    @Test
    public void testGetAudioPacketDelay1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "{\"null\":\"\"}";
        java.lang.Integer expectedObject = (java.lang.Integer) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(null, receivingObject.getAudioPacketDelay());
    }

    @Test
    public void testIsRtxEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(true, receivingObject.isRtxEnabled());
    }

    @Test
    public void testStereoEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.stereoEnabled());
    }

    @Test
    public void testGetOpusMaxAverageBitrate1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(-1, receivingObject.getOpusMaxAverageBitrate());
    }

    @Test
    public void testIsTccEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(true, receivingObject.isTccEnabled());
    }

    @Test
    public void testGetMinBitrate1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(-1, receivingObject.getMinBitrate());
    }

    @Test
    public void testGetStartBitrate1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(800, receivingObject.getStartBitrate());
    }

    @Test
    public void testIsRembEnabled1() throws Exception {
        String receivingObjectStr = 
        "{\"org.jitsi.jicofo.JitsiMeetConfig\":{\"properties\":{\"entry\":[{\"string\":[\"channelLastN\",-1]},{\"string\":[\"enableLipSync\",false]},{\"string\":[\"openSctp\",true]},{\"string\":[\"disableRtx\",false]}]}}}";
        org.jitsi.jicofo.JitsiMeetConfig receivingObject = (org.jitsi.jicofo.JitsiMeetConfig) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isRembEnabled());
    }
}