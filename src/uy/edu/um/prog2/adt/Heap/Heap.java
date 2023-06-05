package uy.edu.um.prog2.adt.Heap;
import uy.edu.um.prog2.adt.BinarySearchTree.BinarySearchTree;
public class Heap <T extends Comparable<T>, V>implements MyHeap<T, V> {
    private static final int CAPACIDAD_INICIAL = 10;
     private Entry<T, V>[] table;
    private int size;

    @Override
    public void add(T key, V value) {

    }

    @Override
    public void return_remove(T value) throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("El Heap está vacío.");
        }

    }

    @Override
    public void size() {


    }
}


