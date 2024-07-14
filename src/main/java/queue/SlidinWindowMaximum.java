package queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SlidinWindowMaximum {

    /**
     * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
     *
     * Return the max sliding window.
     */



    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        q.add(12);
        q.add(4);
        q.add(15);


        System.out.println(q.peek());

        System.out.println(q);
    }
}
