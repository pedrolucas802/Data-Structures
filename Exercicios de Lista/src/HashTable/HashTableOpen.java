package HashTable;

public class HashTableOpen {

    private final Integer[] table;

    public HashTableOpen(int n){
        table = new Integer[n];
    }

    public int hashing(int x){
        return x % table.length;
    }

    public void add(int element){
        //table[element% table.length] = element;  - way to eliminate hashing function
        int index = hashing(element);
        int newIndex = index;
        int i = 0;

        while(table[newIndex]!=null){
            i++;
            newIndex = (index + i) % table.length;
        }

        table[newIndex] = element;
    }

    public void show(){
        for(int i = 0; i<table.length;i++){
            System.out.print(table[i]+" ");
        }
    }
}
