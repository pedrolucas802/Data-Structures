package Lists;

public class AlphabeticalList {
    public NoString first;
    public NoString last;
    public int cnt;


    public int compare(String prim, String seg) {
        return prim.compareTo(seg);
    }

    public AlphabeticalList(){
        first = null;
        last = null;
        cnt = 0;
    }

    public void add( String element) {
        Lists.NoString NEW = new Lists.NoString(element);

        if (first == null) {
            first = NEW;
            last = NEW;
        }else if(compare(NEW.dado,first.dado)<0){
            NEW.next = first;
            first = NEW;

        }else if(compare(NEW.dado,last.dado)>=0){
            last.next = NEW;
            last = NEW;
        }else{ //interposition
            Lists.NoString aux = first;
            while(compare(NEW.dado,aux.next.dado) >= 0) {
                aux = aux.next;
            }
            NEW.next = aux.next;
            aux.next = NEW;

        }
        cnt++;
    }

    public void remove(){
        NoString aux = first;

        while(aux.next != last) {
            aux = aux.next;
        }
        aux.next = null;
        last = null;

        cnt--;
    }

    public void remove(int position){
        NoString aux = search(position-1);
        aux.next = aux.next.next;

        cnt--;
    }

    public int size(){
        return cnt;
    }

    public void clean(){

    }

    public void contain(Object element){

    }

    public NoString getter(int position){
        NoString aux = first;

        if(position >= cnt){
            System.out.println("Position input '>=' list size.");
        }else{
            for(int i = 0; i< cnt; i++){
                aux = aux.next;
            }
        }

        return aux;
    }

    public NoString search(int position){
        NoString aux = first;
        for(int i = 0; i <position; i++){
            aux = aux.next;
        }
        return aux;
    }

    public void show(){
        NoString aux = first;

        while(aux !=null) {
            System.out.println(aux.dado+" ");
            aux = aux.next;
        }

    }

}
