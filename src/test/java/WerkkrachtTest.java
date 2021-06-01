import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkkrachtTest {

    @Test
    void Checknaam() {
        Werkkracht persoon = new Werkkracht("Faissal",20920876, 2009,629282928);
        String naam = "Faissal";
        Assertions.assertEquals(true ,persoon.checknaamArray(naam));
        Assertions.assertEquals(false, persoon.checknaamArray("Chantal"));
        Werkkracht newperson = new Werkkracht("Mohamed", 182763542, 1987,675432132);
        Assertions.assertEquals(true, newperson.checknaamArray("Mohamed"));


    }
}