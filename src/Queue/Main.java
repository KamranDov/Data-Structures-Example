package Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> q = new PriorityQueue<>();
//        q.offer(6);
//        q.offer(12);
//        q.offer(32);
////        q.remove(6);
//        q.poll();
//        q.poll();
//        System.out.println(q);

        QueueArray<Integer> queue = new QueueArray<>(4);
//        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); //process be FIFO
        System.out.println(queue.dequeue()); //process be FIFO
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue()); //process be FIFO
        System.out.println(queue.dequeue()); //process be FIFO
        queue.printer();
    }

}
