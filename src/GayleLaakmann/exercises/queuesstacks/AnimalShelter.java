package GayleLaakmann.exercises.queuesstacks;

import GayleLaakmann.datastructures.queue.MyQueue;

public class AnimalShelter {

    private MyQueue<Animal> dogs = new MyQueue<>();
    private MyQueue<Animal> cats = new MyQueue<>();
    private int order = 0;

    void enqueue(Animal animal) {
        animal.order = order;
        order++;
        if (animal instanceof Dog) dogs.add(animal);
        else cats.add(animal);
    }

    public Animal dequeueAny() {
        if (cats.isEmpty()) return dequeueDog();
        if (dogs.isEmpty()) return dequeueCat();
        if (dogs.peek().order < cats.peek().order) return dequeueDog();
        return dequeueCat();
    }


    public Animal dequeueDog() {
        return dogs.remove();
    }


    public Animal dequeueCat() {
        return cats.remove();
    }

    public boolean isEmpty() {
        return dogs.isEmpty() && cats.isEmpty();
    }

}
