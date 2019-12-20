package GayleLaakmann.exercises.queuesstacks;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class AnimalShelterTest {

    AnimalShelter shelter;

    @BeforeEach
    void resetShelter() {
        shelter = new AnimalShelter();
    }

    @Test
    void dequeueAny() {
        shelter.enqueue(new Dog());
        shelter.enqueue(new Cat());
        shelter.enqueue(new Dog());
        Assert.assertEquals("Dog", shelter.dequeueAny().name);
        Assert.assertEquals("Cat", shelter.dequeueAny().name);
        Assert.assertEquals("Dog", shelter.dequeueAny().name);
        Assert.assertTrue(shelter.isEmpty());
    }

    @Test
    void dequeueDog() {
        shelter.enqueue(new Cat());
        shelter.enqueue(new Cat());
        shelter.enqueue(new Cat());
        shelter.enqueue(new Dog());
        Assert.assertEquals("Dog", shelter.dequeueDog().name);
        Assertions.assertThrows(NoSuchElementException.class, () -> shelter.dequeueDog());
        Assert.assertFalse(shelter.isEmpty());
    }

    @Test
    void dequeueCat() {
        shelter.enqueue(new Dog());
        shelter.enqueue(new Cat());
        shelter.enqueue(new Cat());
        shelter.enqueue(new Cat());
        Assert.assertEquals("Cat", shelter.dequeueCat().name);
        Assert.assertEquals("Cat", shelter.dequeueCat().name);
        Assert.assertEquals("Cat", shelter.dequeueCat().name);
        Assertions.assertThrows(NoSuchElementException.class, () -> shelter.dequeueCat());
        Assert.assertEquals("Dog", shelter.dequeueAny().name);
        Assert.assertTrue(shelter.isEmpty());
    }
}