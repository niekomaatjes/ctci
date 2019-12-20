package GoogleTechDev.minesweeper;

public class MainMinesweeper {

    public static void main(String[] args) {
        PlayingField field = new PlayingField(4, 4, 2);
        field.addMine(0,0);
        field.addMine(3,3);
        field.expose(2, 2);
        field.print();
        field.expose(1, 1);
        field.print();
        field.expose(2, 1);
        field.print();
    }

}
