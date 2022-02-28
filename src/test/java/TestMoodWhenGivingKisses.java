import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMoodWhenGivingKisses {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final Boyfriend boyfriend = new Boyfriend(new Neutral());

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void boyfriendThanksForTheKissWhenNeutral() {
        boyfriend.setCurrentMood(new Neutral());

        boyfriend.giveKiss();

       assertEquals("Thank you for the kiss!\n", outContent.toString());
    }

    @Test
    void boyfriendRejectsTheKissWhenAnnoyed() {
        boyfriend.setCurrentMood(new Annoyed());

        boyfriend.giveKiss();

        assertEquals("I'm too annoyed to kiss right now\n", outContent.toString());
    }

    @Test
    void boyfriendIsVeryThankfulForTheKissWhenHappy() {
        boyfriend.setCurrentMood(new Happy());

        boyfriend.giveKiss();

        assertEquals("Thank you! <3\n", outContent.toString());
    }
}
