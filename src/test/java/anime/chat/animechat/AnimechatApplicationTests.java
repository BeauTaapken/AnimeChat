package anime.chat.animechat;

import anime.chat.animechat.model.ChatMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimechatApplicationTests {
    private ChatMessage chatMessage = new ChatMessage("testContent", "testAudio", "testSender");

    @Test
    public void GetContent(){
        Assert.assertEquals("testContent", chatMessage.getContent());
    }

    @Test
    public void SetContent(){
        chatMessage.setContent("newTestContent");
        Assert.assertEquals("newTestContent", chatMessage.getContent());
    }

    @Test
    public void GetAudio(){
        Assert.assertEquals("testAudio", chatMessage.getAudio());
    }

    @Test
    public void SetAudio(){
        chatMessage.setAudio("newTestAudio");
        Assert.assertEquals("newTestAudio", chatMessage.getAudio());
    }

    @Test
    public void GetSender(){
        Assert.assertEquals("testSender", chatMessage.getSender());
    }

    @Test
    public void SetSender(){
        chatMessage.setSender("newTestSender");
        Assert.assertEquals("newTestSender", chatMessage.getSender());
    }
}
