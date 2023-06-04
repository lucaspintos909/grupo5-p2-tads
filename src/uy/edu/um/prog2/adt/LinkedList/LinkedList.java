package uy.edu.um.prog2.adt.LinkedList;

import uy.edu.um.prog2.adt.Queue.EmptyQueueException;
import uy.edu.um.prog2.adt.Queue.MyQueue;
import uy.edu.um.prog2.adt.Stack.EmptyStackException;
import uy.edu.um.prog2.adt.Stack.MyStack;


public class LinkedList<T> implements MyStack<T>, MyQueue<T>, Mylist<T> {
    public Nodo<T> head;
    public Nodo<T> tail;
    public int size;

    public LinkedList() {
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
        int contador = 0;
        while (nodo != null) {

            if (nodo.variable == value) {
                System.out.println(value + " se encuentra en la lista en el lugar " + contador);
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
        if (size != 0) {
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
        return head.variable;
    }

    @Override
    public void enqueue(T value) {
        Nodo<T> node = new Nodo<>(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (size == 0) {
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

        Nodo<T> secondlast = new Nodo<>(get(size - 2));
        T val = tail.variable;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    @Override
    public boolean contains(Object value) {
        Nodo<T> nodo = head;
        int contador = 0;
        while (nodo != null) {

            if (nodo.variable == value) {
                System.out.println(value + " se encuentra en la lista en el lugar " + contador);
                return true;
            } else {
                contador++;
                nodo = nodo.next;
            }

        }
        System.out.println(value + " no se encuentra en la lista");
        return false;
    }

    @Override
    public int size() {
        int listSize = 0;
        Nodo<T> aux = head;

        if (aux == null) {
            return listSize;
        }

        while (aux.next != null) {
            aux = aux.next;
            listSize++;
        }
        listSize++;

        return listSize;
    }


    @Override
    public T get(int index) {
        Nodo<T> it = head;

        if (index == 0) {
            return head.variable;
        }

        for (int i = 0; i < index; i++) {
            it = it.next;
        }

        return it.variable;
    }


    public T delete(int index) {
        if (index == 0) {
            return remove();
        }
        if (index == size - 1) {
            return delatelast();
        }
        Nodo<T> prev = new Nodo<>(get(size - 1));
        T val = prev.next.variable;

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

        Nodo<T> secondlast = new Nodo<>(get(size - 2));
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
        if (size == 0) {
            System.out.println("Esta Vacia ");
            return true;

        } else {
            System.out.println("No Esta Vacia, contiene " + size + " elementos");
            return false;
        }
    }
}
