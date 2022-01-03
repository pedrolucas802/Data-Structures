package Lists;

public class OrderedList {
        private No first;
        private No last;
        private int cnt;

        public OrderedList(){
            first = null;
            last = null;
            cnt = 0;
        }

        public void add( int element) {
            No NEW = new No(element);

            if (first == null) {
                first = NEW;
                last = NEW;
            }else if(NEW.dado < first.dado){
                NEW.next = first;
                first = NEW;

            }else if(NEW.dado >= last.dado){
                last.next = NEW;
                last = NEW;
            }else{ //interposition
                No aux = first;
                while(NEW.dado >= aux.next.dado) {
                    aux = aux.next;
                }
                NEW.next = aux.next;
                aux.next = NEW;

            }
            cnt++;
        }

        public void add(int position, int element){
            No aux = search(position-1);
            No NEW =  new No(element);

            NEW.next = aux.next;
            aux.next = NEW;
//circular
//        last.next = first;
//        first.anterior = last;

            cnt++;
        }

        public void remove(){
            No aux = first;

            while(aux.next != last) {
                aux = aux.next;
            }
            aux.next = null;
            last = null;

            cnt--;
        }

        public void remove(int position){
            No aux = search(position-1);
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


