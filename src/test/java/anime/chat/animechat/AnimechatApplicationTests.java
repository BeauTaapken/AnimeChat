package anime.chat.animechat;

import anime.chat.animechat.model.ChatMessage;
import anime.chat.animechat.model.VideoMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimechatApplicationTests {
    private ChatMessage chatMessage = new ChatMessage(ChatMessage.MessageType.CHAT, "testContent", "testSender");
    private VideoMessage videoMessage = new VideoMessage("testContent", "testAudio", "testSender");

    @Test
    public void GetChatTypeCorrect(){ Assert.assertEquals(ChatMessage.MessageType.CHAT, chatMessage.getType()); }

    @Test
    public void GetChatTypeWrong(){ Assert.assertNotEquals(ChatMessage.MessageType.LEAVE, chatMessage.getType()); }

    @Test
    public void SetChatTypeCorrect(){
        chatMessage.setType(ChatMessage.MessageType.JOIN);
        Assert.assertEquals(ChatMessage.MessageType.JOIN, chatMessage.getType());
    }

    @Test
    public void SetChatTypeWrong(){
        chatMessage.setType(ChatMessage.MessageType.LEAVE);
        Assert.assertNotEquals(ChatMessage.MessageType.JOIN, chatMessage.getType());
    }

    @Test
    public void GetChatContentCorrect(){ Assert.assertEquals("testContent", chatMessage.getContent()); }

    @Test
    public void GetChatContentWrong(){ Assert.assertNotEquals("wrongContent", chatMessage.getContent()); }

    @Test
    public void SetChatContentCorrect(){
        chatMessage.setContent("newTestContent");
        Assert.assertEquals("newTestContent", chatMessage.getContent());
    }

    @Test
    public void SetChatContentWrong(){
        chatMessage.setContent("newWrongTestContent");
        Assert.assertNotEquals("wrong", chatMessage.getContent());
    }

    @Test
    public void GetChatSenderCorrect(){ Assert.assertEquals("testSender", chatMessage.getSender()); }

    @Test
    public void GetChatSenderWrong(){ Assert.assertNotEquals("wrongTestSender", chatMessage.getSender()); }

    @Test
    public void SetChatSenderCorrect(){
        chatMessage.setSender("newTestSender");
        Assert.assertEquals("newTestSender", chatMessage.getSender());
    }

    @Test
    public void SetChatSenderWrong(){
        chatMessage.setSender("newWrongTestSender");
        Assert.assertNotEquals("newTestSender", chatMessage.getSender());
    }

    @Test
    public void GetVideoContentCorrect(){
        Assert.assertEquals("testContent", videoMessage.getContent());
    }

    @Test
    public void GetVideoContentWrong(){
        Assert.assertNotEquals("wrongContent", videoMessage.getContent());
    }

    @Test
    public void SetVideoContentCorrect(){
        videoMessage.setContent("newTestContent");
        Assert.assertEquals("newTestContent", videoMessage.getContent());
    }

    @Test
    public void SetVideoContentWrong(){
        videoMessage.setContent("newWrongTestContent");
        Assert.assertNotEquals("newTestContent", videoMessage.getContent());
    }

    @Test
    public void GetVideoAudioCorrect(){
        Assert.assertEquals("testAudio", videoMessage.getAudio());
    }

    @Test
    public void GetVideoAudioWrong(){
        Assert.assertNotEquals("wrongAudio", videoMessage.getAudio());
    }

    @Test
    public void SetVideoAudioCorrect(){
        videoMessage.setAudio("newTestAudio");
        Assert.assertEquals("newTestAudio", videoMessage.getAudio());
    }

    @Test
    public void SetVideoAudioWrong(){
        videoMessage.setAudio("newWrongTestAudio");
        Assert.assertNotEquals("newTestAudio", videoMessage.getAudio());
    }

    @Test
    public void GetVideoSenderCorrect(){
        Assert.assertEquals("testSender", videoMessage.getSender());
    }

    @Test
    public void GetVideoSenderWrong(){
        Assert.assertNotEquals("wrongTestSender", videoMessage.getSender());
    }

    @Test
    public void SetVideoSenderCorrect(){
        videoMessage.setSender("newTestSender");
        Assert.assertEquals("newTestSender", videoMessage.getSender());
    }

    @Test
    public void SetVideoSenderWrong(){
        videoMessage.setSender("newWrongTestSender");
        Assert.assertNotEquals("newTestSender", videoMessage.getSender());
    }
}
