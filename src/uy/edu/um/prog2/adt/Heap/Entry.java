package uy.edu.um.prog2.adt.Heap;

public class Entry<T, V> {
    T key;
    V value;

    Entry(T key, V value) {
        this.key = key;
        this.value = value;
    }
}

