package uy.edu.um.prog2.adt.QueueMio;

public interface MyQueue<T> {
    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    int size();

    T get(int position);

    void display();

    boolean Empty();
}
