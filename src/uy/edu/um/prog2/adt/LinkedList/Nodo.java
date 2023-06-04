package uy.edu.um.prog2.adt.LinkedList;

public class Nodo <T>{
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
