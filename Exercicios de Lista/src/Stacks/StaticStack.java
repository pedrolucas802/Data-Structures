package Stacks;

public class StaticStack {

    private final Object[] vector;
    private int cnt = 0;

    public StaticStack(int n){
        vector = new Object[n];
        int cnt = 0;
    }

    public void push( Object element){
            vector[cnt] = element;
            cnt++;
    }

    public void pop(){
        cnt--;
    }

    public int top(){
        int top = cnt -1;
        return (int) vector[top];
    }

    public boolean empty(){
        if(cnt == 0){
            return true;
        }else{
            return false;
        }
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

    public int search(int position){
        return (int) vector[position];
    }

    public void show(){
        for(int i = 0; i < cnt; i++){
            System.out.print(vector[i]+" ");
        }
    }
}
