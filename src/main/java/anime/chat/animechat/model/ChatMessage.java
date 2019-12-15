package anime.chat.animechat.model;

public class ChatMessage {
    private String content;
    private String audio;
    private String sender;

    /**
     * Used for normal use
     */
//    public ChatMessage(){};

    /**
     * Used in tests
     * @param content This is the content that needs to be send(video)
     * @param audio This is the audio that needs to be send(might be mixed with video in the future
     * @param sender This is the name of the sender(username of user)
     */
    public ChatMessage(String content, String audio, String sender){
        this.content = content;
        this.audio = audio;
        this.sender = sender;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getAudio(){
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
