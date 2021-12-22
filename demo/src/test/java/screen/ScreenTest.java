package screen;
import org.junit.Test;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import world.World;

import static org.junit.Assert.*;

import java.io.IOException;


public class ScreenTest {
    @Test
    public void testScreen() throws IOException {
        AsciiPanel terminal = new AsciiPanel(World.WIDTH, World.HEIGHT+1, AsciiFont.NCP437_16x16);
        WorldScreen screenx= new WorldScreen();
        screenx.build_fail_screen();
        screenx.displayOutput(terminal);
        screenx.build_won_screen();
        screenx.displayOutput(terminal);
        screenx.build_game_screen();
        screenx.displayOutput(terminal);
        screenx.build_start_screen();
        screenx.displayOutput(terminal);
        screenx.rebuild_saved_game();
        screenx.displayOutput(terminal);
        screenx.replay_game_screen();
        screenx.displayOutput(terminal);
        assertEquals(1, 1);
    }
}
