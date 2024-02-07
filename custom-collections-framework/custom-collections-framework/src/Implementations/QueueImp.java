package Implementations;

import Interfaces.Queue;

import java.util.Arrays;

public class QueueImp<T> implements Queue<T> {

    private T queue[];
    private int length = 0; //total size of the array filled with objects
    private int size = 10; //total size of the array

    public QueueImp() {
        queue = (T[]) new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T data) {
        if (length < size) {
            //if array is not full
            queue[length] = data;
            length++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(T data) {
        boolean foundData = false;
        for (int i = 0; i < length; i++) {
            if (data == queue[i]) {
                foundData = true;
                queue[i] = null;
                length--;
            }
            if (foundData) {
                queue[i] = queue[i + 1];
                queue[length] = null;
            }
        }
        return false;
    }

    @Override
    public boolean contains(T data) {
        //for loop
        //array = [1, 6, 9]
        //array.contains(6);
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                if (queue[i] == data) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                queue[i] = null;
            }
            length = 0;
        }
    }

    @Override
    public boolean offer(T data) {
        return add(data);
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return queue[0];
        }
        return null;
    }

    @Override
    public T poll() {
        T objectToPoll;
        if (!isEmpty()) {
            objectToPoll = queue[0];
            remove(queue[0]);
            return objectToPoll;
        }
        return null;
    }

    @Override
    public String toString() {
        return "QueueImp { " +
                "queue = " + Arrays.toString(queue) +
                ", length = " + length +
                ", size = " + size +
                '}';
    }
}
