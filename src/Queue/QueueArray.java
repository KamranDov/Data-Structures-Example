package Queue;

public class QueueArray<T> {
    Object[] ArrayQueue;
    int rear, front, maxSize, nItems;

    public QueueArray(int size) {
        this.maxSize = size;
        ArrayQueue = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(Object obj) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        ArrayQueue[rear] = obj;
        nItems++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T objectOut = (T) ArrayQueue[front];
        for (int i = 1; i < rear + 1; i++) {
            T temp = (T) ArrayQueue[i];
            ArrayQueue[i - 1] = temp;
        }
        ArrayQueue[rear] = null;
        nItems--;
        rear--;
        return objectOut;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void printer() {
        System.out.println("Listing the elements in the queue");
        for (int i = 0; i < ArrayQueue.length; i++) {
            System.out.println("Element order [" + (i + 1) + "]" + ArrayQueue[i]);
        }
    }
}
