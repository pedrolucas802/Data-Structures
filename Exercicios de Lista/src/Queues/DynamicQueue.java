package Queues;

import Lists.No;

public class DynamicQueue {
    private No first;
    private No last;
    private int cnt;

    public DynamicQueue(){
        first = null;
        last = null;
        cnt = 0;
    }

    public void enqueue( int element){
        No NEW = new No(element);

        if(first == null){
            first = NEW;
            last  = NEW;
        }else{
            last.next = NEW;
            NEW.anterior = last;
            last = NEW;
//circular video 12
//            last.next = first;
//            first.anterior = last;
        }
        cnt++;
    }

    public void dequeue(){
       first = first.next;
        cnt--;
    }

    public boolean empty(){
        return cnt == 0;
    }

    public int size(){
        return cnt;
    }

    public void clean(){

    }

    public void contain(Object element){

    }

    public No getter(int position){
        No aux = first;

        if(position >= cnt){
            System.out.println("Position input '>=' list size.");
        }else{
            for(int i = 0; i< cnt; i++){
                aux = aux.next;
            }
        }

        return aux;
    }

    public No search(int position){
        No aux = first;
        for(int i = 0; i <position; i++){
            aux = aux.next;
        }
        return aux;
    }

    public void show(){
        No aux = first;

        while(aux !=null) {
            System.out.print(aux.dado+" ");
            aux = aux.next;
        }
        System.out.println();

    }

}
