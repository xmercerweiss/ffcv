package app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.Launcher;

public class LauncherTests {

    @Test
    void testVersionType() {
        assertInstanceOf(String.class, Launcher.getVersion());
    }

}
