package Queues;

public class StaticQueue {

    private final Object[] vector;
    private int start = 0;
    private int end = 0;
    private int cnt = 0;

    public StaticQueue(int n){
        vector = new Object[n];
        int cnt = 0;
        int start = 0;
        int end = -1;
    }

    public void enqueue( Object element){
        vector[end] = element;
        end++;
        cnt++;
    }

    public void dequeue(){
//        for(int i = 0; i < cnt-1;i++){
//            vector[i] = vector[i+ 1];
//        }
        start++;
        cnt--;
    }

    public boolean empty(){
        //if else simplified
        return cnt == 0;
    }

    public int size(){
        return(cnt);
    }

    public void clean(){
        cnt = 0;
    }

    public boolean contain(Object element){
        for(int i = 0; i< cnt; cnt++){
            if (vector[i] == element) {
                return true;
            }
        }
        return false;
    }

    public Object search(int position){

        return vector[position];
    }

    public void show(){
        for(int i = start; i < end; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }

}
