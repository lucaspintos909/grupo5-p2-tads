package StackMio;

public interface MyStack <T>{
    void push(T value);

    T pop() throws EmptyStackException;

    T peek();

    int size();

     T get(int position);

    void display();

    boolean Empty();
}


