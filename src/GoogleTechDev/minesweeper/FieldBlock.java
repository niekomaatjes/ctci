package GoogleTechDev.minesweeper;

public class FieldBlock {

    private int value = -1;
    private boolean exposed = false;

    public FieldBlock(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (!exposed) return "-";
        return String.valueOf(value);
    }
}
