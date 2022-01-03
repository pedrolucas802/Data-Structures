package Queues;

public class Ordered_PriorityQueue {
        private NoPQ first;
        private NoPQ last;
        private int cnt;

        public Ordered_PriorityQueue(){
            first = null;
            last = null;
            cnt = 0;
        }

        public void enqueue( int element, int priority) {
            NoPQ NEW = new NoPQ(element, priority);

            if (first == null) { //empty
                first = NEW;
                last = NEW;
            }else if(NEW.priority < first.priority){ //first position
                NEW.next = first;
                first = NEW;

            }else if(NEW.priority >= last.priority){ //last position
                last.next = NEW;
                last = NEW;
            }else{ //inter position
                NoPQ aux = first;
                    while(NEW.priority >= aux.next.priority) {
                        aux = aux.next;
                    }
                NEW.next = aux.next;
                aux.next = NEW;
                aux.next.previous = NEW;
                NEW.previous = aux;
            }
            cnt++;
        }

        public void dequeue(){
           first = first.next;
           cnt--;
        }

        public int size(){
            return cnt;
        }

        public void clean(){

        }

        public void contain(Object element){

        }

        public NoPQ getter(int position){
            NoPQ aux = first;

            if(position >= cnt){
                System.out.println("Position input '>=' list size.");
            }else{
                for(int i = 0; i< cnt; i++){
                    aux = aux.next;
                }
            }

            return aux;
        }

        public NoPQ search(int position){
            NoPQ aux = first;
            for(int i = 0; i <position; i++){
                aux = aux.next;
            }
            return aux;
        }

        public void show(){
            NoPQ aux = first;

            while(aux !=null) {
                System.out.print(aux.dado+" ");
                aux = aux.next;
            }
            System.out.println();

        }

    }


