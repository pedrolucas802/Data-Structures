package Stacks;

import Lists.No;

public class DynamicStack {
    private No top;
    private int cnt;

    public DynamicStack(){
        top = null;
        cnt = 0;
    }

    public void push( int element){
        No NEW = new No(element);

        if(top == null){
            top = NEW;
        }else{
            top.next = NEW;
            top = NEW;
        }
        cnt++;
    }

    public void pop(){
//        Lists.No aux = first;
//        while(aux.next != last) {
//            aux = aux.next;
//        }
//        aux.next = null;
//        last = null;
        top = top.next;
        cnt--;
    }

    public int peek(){
        return top.dado;
    }

    public int size(){
        return cnt;
    }

    public void clean(){

    }

    public void contain(Object element){

    }

    public No getter(int position){
        No aux = top;

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
        No aux = top;
        for(int i = 0; i <position; i++){
            aux = aux.next;
        }
        return aux;
    }

    public void show(){
        No aux = top;

        while(aux !=null) {
            System.out.print(aux.dado+" ");
            aux = aux.next;
        }
        System.out.println();

    }

}
