import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayBuilderTest {

    private Play play;

    @BeforeEach
    void before() {
        play = new PlayBuilder("name of a play")
                .author("MJ")
                .playInfo(PlayInfo.ROCK)
                .build();
    }

    @Test
    void testPlayBuild(){
        assertEquals("name of a play", play.getNamePlay());
        assertEquals("MJ", play.getAuthor());
        assertEquals(PlayInfo.ROCK, play.getPlayinfo());
    }

}
