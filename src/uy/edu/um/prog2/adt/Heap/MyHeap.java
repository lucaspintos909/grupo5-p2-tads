package uy.edu.um.prog2.adt.Heap;

public interface MyHeap<T extends Comparable<T>,V> {
    void add(T key,V value);

    void return_remove(T value) throws NoSuchElementException;

    void size();

}
