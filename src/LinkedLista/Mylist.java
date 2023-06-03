package LinkedLista;

public interface Mylist <T>{

    void add(T val);

    T get(int index);

    T remove();

    int size();

    boolean contains(T value);

    void display();
}
