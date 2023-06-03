package StackMio;
import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) throws EmptyStackException {
        MyStack<Integer>stackll = new LinkedList<Integer>();
        stackll.push(7);
        stackll.push(9);
        stackll.push(1);
        stackll.push(3);
        stackll.push(5);
        stackll.display();
        stackll.pop();
        stackll.pop();
        stackll.display();
        stackll.peek();
        stackll.display();
        stackll.Empty();




    }

}
