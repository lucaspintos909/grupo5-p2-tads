package QueueMio;
import LinkedList.LinkedList;


public class Main {
    public static void main(String[] args) throws EmptyQueueException {
        MyQueue<Integer> stackll = new LinkedList<>();
        stackll.enqueue(7);
        stackll.enqueue(9);
        stackll.enqueue(1);
        stackll.enqueue(3);
        stackll.enqueue(5);
        stackll.display();
        stackll.dequeue();
        stackll.display();
        stackll.dequeue();
        stackll.contains(7);
        stackll.contains(1);
        stackll.display();
        stackll.Empty();
    }
}
