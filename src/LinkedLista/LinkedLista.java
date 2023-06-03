package LinkedLista;

import QueueMio.EmptyQueueException;
import QueueMio.MyQueue;
import StackMio.EmptyStackException;
import StackMio.MyStack;

import java.util.function.Supplier;

public class LinkedLista<T> implements MyStack<T>, MyQueue,Mylist<T> {
    public Nodo<T> head;
    public Nodo<T> tail;
    public int size;

    public LinkedLista() {
        this.size = 0;
    }

    public void add(T val) {
        Nodo<T> node = new Nodo<>(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void addlast(T val) {
        Nodo<T> node = new Nodo<>(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(T val, int index) {
        if (index == 0) {
            add(val);
            return;
        }
        if (index == size) {
            addlast(val);
            return;
        }
        Nodo<T> temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Nodo<>(val, temp.next);
        size++;
    }

    public void find(T value) {
        Nodo<T> nodo = head;
        int contador=0;
        while (nodo != null) {

            if (nodo.variable == value) {
                System.out.println(value + " se encuentra en la lista en el lugar "+contador);
                return;

            }
            contador++;
            nodo = nodo.next;
        }
        System.out.println(value + " no se encuentra en la lista");
    }

    @Override
    public void push(T value) {
         Nodo<T> node = new Nodo<>(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (size!=0) {
            T val = head.variable;
            head = head.next;

            if (head == null) {
                tail = null;
            }
            size--;
            return val;
        } else {
            throw new EmptyStackException();

        }
    }

    @Override
    public T peek() {
        T val = head.variable;

        return val;

    }

    @Override
    public void enqueue(Object value) {
          Nodo<T> node = (Nodo<T>) new Nodo<>(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    @Override
    public Object dequeue() throws EmptyQueueException {
         if (size==0) {
            throw new EmptyQueueException();
        }
        if (size <= 1) {
            T val = head.variable;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return val;
        }

        Nodo<T> secondlast = (Nodo<T>) get(size - 2);
        T val = tail.variable;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    @Override
    public boolean contains(Object value) {
         Nodo<T> nodo = head;
        int contador=0;
        while (nodo != null) {

            if (nodo.variable == value) {
                System.out.println(value + " se encuentra en la lista en el lugar "+contador);
                return true;
            }else {
                contador++;
                nodo = nodo.next;
            }

        }
        System.out.println(value + " no se encuentra en la lista");
        return false;
    }

    @Override
    public int size() {
        Integer size=0;
        Nodo<T>pri=head;
        while (pri!=null){
            pri=head.next;
            size++;
        }
        return size;
    }

    @Override
    public T get(int index) {
        Nodo<T> nodo = head;
        for (int i = 0; i < index; i++) {
            nodo = nodo.next;
        }
        return (T) nodo;
    }


    public T delete(int index) {
        if (index == 0) {
            return remove();
        }
        if (index == size - 1) {
            return delatelast();
        }
        Nodo<T> prev = (Nodo<T>) get(index - 1);
        T val = (T) prev.next.variable;

        prev.next = prev.next.next;
        return val;

    }

    public T remove() {
        T val = head.variable;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public T delatelast() {
        if (size <= 1) {
            return remove();
        }

        Nodo<T> secondlast = (Nodo<T>) get(size - 2);
        T val = tail.variable;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public void display() {
        Nodo<T> temp = head;
        while (temp != null) {
            System.out.print(temp.variable + " -> ");
            temp = temp.next;

        }
        System.out.println("FIN");
    }

    @Override
    public boolean Empty() {
        if (size==0){
            System.out.println("Esta Vacia ");
            return true;

        }
        else {
            System.out.println("No Esta Vacia, contiene "+size+" elementos");
            return false;}
    }

    public class Nodo<T> {
        public T variable;
        public Nodo<T> next;

        public Nodo(T variable) {
            this.variable = variable;
        }

        public Nodo(T variable, Nodo<T> next) {
            this.variable = variable;
            this.next = next;

        }
    }

}
