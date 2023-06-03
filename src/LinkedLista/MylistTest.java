package LinkedLista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MylistTest {

    Mylist<Integer>listll=new LinkedLista<Integer>();
    @Test
    void add() {
        listll.add(10);
        assertEquals(listll.size(),1);
    }

    @Test
    void get() {
    }

    @Test
    void remove() {
        listll.add(10);
        listll.remove();
        assertEquals(listll.size(),0);
    }

    @Test
    void size() {
        listll.add(10);
        listll.add(9);
        assertEquals(listll.size(),2);
    }
    @Test
    void contains() {
        listll.add(10);
        assertTrue(true, String.valueOf(listll.contains(10)));
    }
}