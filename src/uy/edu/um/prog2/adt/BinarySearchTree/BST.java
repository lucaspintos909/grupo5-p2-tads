package uy.edu.um.prog2.adt.BinarySearchTree;

public class BST {
    public class NodeBST <K extends Comparable<K>, T> {
        K key;
        T data;
        NodeBST <K, T> leftChild;
        NodeBST <K, T> rightChild;
    }
    public interface MyBinarySearchTree <K extends Comparable<K>, T>
    {
        T find(K key);
        void insert(K key, T data);
        void delete (K key);

    }
}
