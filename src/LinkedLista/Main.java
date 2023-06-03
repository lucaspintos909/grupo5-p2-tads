package LinkedLista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedLista<Integer> listo = new LinkedLista<Integer>();
        listo.add(3);
        listo.add(2);
        listo.add(8);
        listo.add(17);
        listo.addlast(99);
        listo.insert(120, 3);
        System.out.println(listo.remove());
        listo.display();
        System.out.println(listo.delatelast());
        listo.display();
        System.out.println(listo.delete(2));
        listo.display();
        listo.find(200);
        listo.find(2);
    }
}
