package GayleLaakmann.exercises.queuesstacks;

public abstract class Animal {

    public String name = "";
    public int order;

    @Override
    public String toString() {
        return "I'm a " + name;
    }
}
