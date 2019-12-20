package GoogleTechDev.iteratorofiterators;

import java.util.*;

public class GenericWeavedIterator implements WeavedIterator {

    private Queue<Iterator> iterators;
    int currentIteratorIndex = 0;

    public GenericWeavedIterator(Iterator... iterators) {
        this.iterators = new LinkedList<>(Arrays.asList(iterators));
    }

    @Override
    public Object next() {
        if (!hasNext()) throw new NoSuchElementException();
        Iterator current = iterators.poll();
        if (current.hasNext()) {
            iterators.add(current);
            return current.next();
        }
        return next();
    }

    @Override
    public boolean hasNext() {
        return (iterators.size() != 0);
    }
}
