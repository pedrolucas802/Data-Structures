package HashTable;

import Lists.DynamicList;

public class HashTableClosed {
    private final DynamicList[] table;

    public HashTableClosed(int n){
        table = new DynamicList[n];
    }

    public int hashing(int x){
        return x % table.length;
    }

    public void add(int element){
        //table[element% table.length] = element;  - way to eliminate hashing function
        int index = hashing(element);

        if(table[index] == null){
            table[index] = new DynamicList();
        }
        table[index].add(element);
    }

    public void show(){
        for(int i = 0; i<table.length;i++){
            if(table[i] != null){
                table[i].show();
            }
        }
    }

    public boolean contain(int element){
        int index = hashing(element);
        if (table[index]!= null){
            return table[index].contain(element);
        }else{
            return false;
        }
    }
}
