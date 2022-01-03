package Queues;

public class NoPQ {
//this is the NO for the priority queue
    public int dado;
    public int priority;
    public NoPQ next;
    public NoPQ previous;

    public NoPQ(int element, int priority){
        dado = element;
        this.priority = priority;
        next = null;
        previous = null;

    }
}

