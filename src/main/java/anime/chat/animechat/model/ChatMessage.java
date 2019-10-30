package anime.chat.animechat.model;

public class ChatMessage {
    private String content;
    private String audio;
    private String sender;

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getAudio(String audio){
        return audio;
    }

    public void setAudio(String audio){
        this.audio = audio;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }
}
