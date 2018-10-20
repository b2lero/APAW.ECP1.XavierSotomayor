package main;

public class PlayBuilder {

    private Play play;

    public PlayBuilder(String namePlay){
        this.play = new Play(namePlay);
    }

    public PlayBuilder author(String author){
        play.setAuthor(author);
        return this;
    }

    public PlayBuilder playInfo(PlayInfo playinfo){
        play.setPlayinfo(playinfo);
        return this;
    }

    public Play build(){
        return this.play;
    }

}
