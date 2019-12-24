package anime.chat.animechat;

import anime.chat.animechat.model.VideoMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimechatApplicationTests {
    private VideoMessage videoMessage = new VideoMessage("testContent", "testAudio", "testSender");

    @Test
    public void GetContent(){
        Assert.assertEquals("testContent", videoMessage.getContent());
    }

    @Test
    public void SetContent(){
        videoMessage.setContent("newTestContent");
        Assert.assertEquals("newTestContent", videoMessage.getContent());
    }

    @Test
    public void GetAudio(){
        Assert.assertEquals("testAudio", videoMessage.getAudio());
    }

    @Test
    public void SetAudio(){
        videoMessage.setAudio("newTestAudio");
        Assert.assertEquals("newTestAudio", videoMessage.getAudio());
    }

    @Test
    public void GetSender(){
        Assert.assertEquals("testSender", videoMessage.getSender());
    }

    @Test
    public void SetSender(){
        videoMessage.setSender("newTestSender");
        Assert.assertEquals("newTestSender", videoMessage.getSender());
    }
}
