package net.xmercerweiss.ffcv.tests;

import static org.junit.jupiter.api.Assertions.*;

import net.xmercerweiss.ffcv.app.Flag;
import org.junit.jupiter.api.*;

import net.xmercerweiss.ffcv.app.Flagger;

class FlaggerTest {

    private Flagger flagger;

    @BeforeEach
    void setUp() {
        flagger = Flagger.instantiate();
    }

    @Test
    @DisplayName("Ensure singleton pattern is implemented")
    void testInstanceIdentity() {
        Flagger newFlagger1 = Flagger.instantiate();
        Flagger newFlagger2 = Flagger.instantiate();
        Flagger newFlagger3 = Flagger.instantiate();
        assertSame(flagger, newFlagger1);
        assertSame(flagger, newFlagger2);
        assertSame(flagger, newFlagger3);
    }

    @Test
    @DisplayName("Ensure all Flag enums may be get+set")
    void testFlagAccess() {
        for (Flag f : Flag.values()) {
            flagger.setFlag(f, true);
            assertTrue(flagger.getFlag(f));
            flagger.setFlag(f, false);
            assertFalse(flagger.getFlag(f));
        }
    }
}
