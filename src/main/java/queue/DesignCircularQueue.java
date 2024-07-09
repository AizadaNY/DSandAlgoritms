package queue;

class MyCircularQueue {
    int[] arr;
    int size;
    int begginingOfTheQueue;
    int topOfTheQueue;

    public MyCircularQueue(int k) {
        size=k;
        arr=new int[size];
        begginingOfTheQueue=-1;
        topOfTheQueue=-1;

    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            begginingOfTheQueue=0;
            topOfTheQueue=0;
            arr[topOfTheQueue]=value;
        }else{
            topOfTheQueue=(topOfTheQueue+1)%size;
            arr[topOfTheQueue]=value;
        }
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(begginingOfTheQueue==topOfTheQueue){
            begginingOfTheQueue=-1;
            topOfTheQueue=-1;
        }else{
            begginingOfTheQueue=(begginingOfTheQueue+1)%size;
        }
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[begginingOfTheQueue];
        }
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[topOfTheQueue];
        }
    }

    public boolean isEmpty() {
        return begginingOfTheQueue==-1;
    }

    public boolean isFull() {
        return begginingOfTheQueue==(topOfTheQueue+1)% size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
