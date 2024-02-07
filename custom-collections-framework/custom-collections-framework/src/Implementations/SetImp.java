package Implementations;

import Interfaces.Set;

import java.util.Arrays;

public class SetImp<T> extends QueueImp<T> implements Set<T> {

    private T set[];
    private int length = 0; //total size of the array filled with objects
    private int size = 10; //total size of the array

    public SetImp() {
        set = (T[]) new Object[size];
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T data) {
        if(length == size || isDuplicate(data)) {
            return false;
        }
        set[length] = (T) data;
        length++;
        return true;
    }

    private boolean isDuplicate(T data) {
        for (int i = 0; i < length; i++) {
            if (data == set[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SetImp {" +
                "set = " + Arrays.toString(set) +
                ", length = " + length +
                ", size = " + size +
                '}';
    }
    //Set extends from Queue, remove(), contains(), isEmpty(), clear()
}
