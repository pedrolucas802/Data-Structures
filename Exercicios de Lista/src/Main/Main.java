package Main;

import HashTable.HashTableOpen;
import Tree.BinarySearchTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        HashTableOpen table = new HashTableOpen(2);
        table.add(4);
        table.add(7);
//        table.add(3);
        table.show();


    }

}
