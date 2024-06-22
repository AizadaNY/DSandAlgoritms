package priorityQueue;

import java.util.PriorityQueue;

public class KClosestPointstoOrigin {

    /**
     * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
     *
     * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
     *
     * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
     */

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((p1, p2) -> p2[0]*p2[0]+p2[1]*p2[1]-p1[0]*p1[0]+p1[1]*p1[1]);

        for(int[] p:points){
            pq.offer(p);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int [][] res=new int[k][2];
        while(k>0){
            res[--k]=pq.poll();
        }

        return res;
    }
}
