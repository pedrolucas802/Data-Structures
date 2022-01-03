package Lists;

public class StaticList {

    private Object vector[];
    private int cnt = 0;

    public StaticList(int n){
        vector = new Object[n];
        int cnt = 0;
    }

    public void add( Object element){
        if (cnt >= vector.length){
            System.out.println("List is already full, element was not added ("+element+")");
        }else{
            vector[cnt] = element;
            cnt++;
        }

    }

    public void add(int position, Object element){
        if (cnt >= vector.length && position <= cnt){
            System.out.println("List is either full or position wasn't available. element was not added ("+element+")");
        }else{
            for(int i = cnt; i > position;i--){
                vector[i] = vector[i-1];
            }
            cnt++;
        }
    }

    public void remove(){
        cnt--;
    }

    public void remove(int position){
        if (cnt< vector.length && position>cnt){
            System.out.println("List is either empty or the position input is invalid.");
        }
        for(int i = position; i < cnt;i++){
            vector[i] = vector[i+ 1];
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
