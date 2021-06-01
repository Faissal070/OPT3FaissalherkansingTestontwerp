import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkkrachtTest {

    @Test
    void Checknaam() {
        Werkkracht persoon = new Werkkracht();
        String naam = "Faissal";
        Assertions.assertEquals(true ,persoon.checknaamArray(naam));
    }
}