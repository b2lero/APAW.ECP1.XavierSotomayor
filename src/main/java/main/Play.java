package main;

import java.util.UUID;

public class Play {

    private String id;
    private String namePlay ;
    private String author;

    private PlayInfo playinfo;

    public Play(String namePlay){
        String uniqueID = UUID.randomUUID().toString();
        this.id = uniqueID;
        this.namePlay = namePlay;
    }

    public String getId() {
        return this.id;
    }

    public String getNamePlay() {
        return namePlay;
    }

    public void setNamePlay(String namePlay) {
        this.namePlay = namePlay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public PlayInfo getPlayinfo() {
        return playinfo;
    }

    public void setPlayinfo(PlayInfo playinfo) {
        this.playinfo = playinfo;
    }

    @Override
    public String toString() {
        return "main.Play{" +
                "id='" + id + '\'' +
                ", namePlay='" + namePlay + '\'' +
                ", author='" + author + '\'' +
                ", playinfo=" + playinfo +
                '}';
    }


}
