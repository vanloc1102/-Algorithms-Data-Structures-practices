package org.example.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
//    Deque<Integer> queue ;
//    public _225_Implement_Stack_using_Queues() {
//        queue = new ArrayDeque<>();
//    }
//
//    public void push(int x) {
//        queue.addLast(x);
//    }
//
//    public int pop() {
//        return queue.pollLast();
//    }
//
//    public int top() {
//        return queue.peekLast();
//    }
//
//    public boolean empty() {
//        return queue.size()==0;
//    }

    Queue<Integer> queue;
    public _225_Implement_Stack_using_Queues() {
        queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
