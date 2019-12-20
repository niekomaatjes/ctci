package GoogleTechDev.minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayingFieldTest {

    PlayingField field;

    @Test
    void addMine_TooMany_Fail() {
        field = new PlayingField(4, 6, 2);
        field.addMine(0, 0);
        field.addMine(3, 5);
        Assertions.assertThrows(IllegalStateException.class, () -> field.addMine(0, 1));
    }

    @Test
    void addMine_AlreadyExistent_Fail() {
        field = new PlayingField(4, 6, 2);
        field.addMine(0, 0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> field.addMine(0, 0));
    }

    @Test
    void expose_IncompletedField_Fail() {
        field = new PlayingField(4, 6, 2);
        Assertions.assertThrows(IllegalStateException.class, () -> field.expose(0, 0));
        field.addMine(0, 0);
        Assertions.assertThrows(IllegalStateException.class, () -> field.expose(0, 1));
    }

    @Test
    void expose_CompleteField_Success() {
        field = new PlayingField(4, 6, 2);
        field.addMine(0, 0);
        field.addMine(0, 1);
        field.expose(0, 2);
    }
}