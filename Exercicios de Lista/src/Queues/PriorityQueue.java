package Queues;

public class PriorityQueue {
    private NoPQ first;
    private NoPQ last;
    private int cnt;

    public PriorityQueue() {
        first = null;
        last = null;
        cnt = 0;
    }

    public void enqueue(int element, int priority) {
        NoPQ NEW = new NoPQ(element, priority);

        if (first == null) {
            first = NEW;
            last = NEW;
        } else {
            last.next = NEW;
            NEW.previous = last;
            last = NEW;
//circular video 12
//            last.next = first;
//            first.anterior = last;
        }
        cnt++;
    }

    public void dequeue() {
        NoPQ aux = null;
        int h = -1;

        while (aux == null) {
            aux = searchPriority(h);
            h++;
        }
//        System.out.println(h);


        if (aux == first) {
            first = aux.next;
        } else {
            aux.previous.next = aux.next;
        }

        if (aux == last) {
            last = last.previous;
        } else {
            aux.next.previous = aux.previous;
        }

        cnt--;
    }

    public int size() {
        return cnt;
    }

    public void clean() {

    }

    public void contain(Object element) {

    }

    public NoPQ searchPriority(int priority) {
        NoPQ aux = first;
        boolean stop = false;

//        while (aux != null && aux.next.priority != priority) {
//            aux = aux.next;
//        }

        while (aux != null && !stop) {
            if (aux.priority == priority) {
                stop = true;
            } else {
                aux = aux.next;
            }
        }

        return aux;
    }

    public NoPQ search(int position) {
        NoPQ aux = first;
        for (int i = 0; i < position; i++) {
            aux = aux.next;
        }
        return aux;
    }

    public void show() {
        NoPQ aux = first;

        if (aux == null) {
            System.out.println("Empty");
        }

        while (aux != null) {
            System.out.print(aux.dado + "(" + aux.priority + ") ");
            aux = aux.next;
        }

        System.out.println();

    }

}


