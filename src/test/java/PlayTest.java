import main.Play;
import main.PlayInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PlayTest {

    private Play play;

    @BeforeEach
    void before(){
        play = new Play("Name of a main.Play");
        play.setAuthor("authorName");
        play.setPlayinfo(PlayInfo.ROCK);
    }

    @Test
    void testPlayAuthor(){
        assertEquals("authorName", play.getAuthor());
        play.setAuthor("newAuthor");
        assertEquals("newAuthor", play.getAuthor());
    }

    @Test
    void testNamePlay(){
        assertEquals("Name of a main.Play", play.getNamePlay());
    }

    @Test
    void testPlayInfo(){
        assertSame(PlayInfo.ROCK, play.getPlayinfo());
    }




}
