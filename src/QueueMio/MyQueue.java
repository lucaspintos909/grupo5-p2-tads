package QueueMio;

import java.util.function.Supplier;

public interface MyQueue<T> {
    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    int size();

    T get(int position);

    void display();

    boolean Empty();
}
