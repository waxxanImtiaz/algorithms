package problem.solving;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterOccurrenceTest {
    CharacterOccurrence characterOccurrence;
    @BeforeEach
    void setUp(){
        characterOccurrence = new CharacterOccurrence();
    }
    @Test
    void repeatingCharacter(){

        assertEquals(18,characterOccurrence.repeatedString("aaabcsaad",30));

    }


}
