package Implementations;

import Interfaces.List;

public class ListImp<T> implements List<T> {

    private Node head;
    private int length = 0;

    public ListImp() {
        head = new Node(null);
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean add(T data) {
        //put data in a node
        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;
        return true;
    }

    @Override
    public boolean remove(T data) {
        if (head.getNext() == null) {
            return false;
        }
        Node iterator = head.getNext();
        Node iterator2 = head;
        while (data != iterator.getData()) {
            if (iterator.getNext() == null) {
                return false;
            } else {
                iterator = iterator.getNext();
                iterator2 = iterator2.getNext();
            }
        }
        iterator2.setNext(iterator.getNext());
        iterator = null;
        length--;
        return true;
    }

    @Override
    public boolean contains(T data) {
        Node iterator = head;

        while (iterator.getNext() != null) {
            if (data == iterator.getData()) {
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true; //we could do the same thing by checking if length == 0;
        }
        return false;
    }

    @Override
    public void clear() {
        if (head.getNext() == null) {
            return;
        }

        Node iterator = head.getNext();
        Node iterator2;

        if (length == 0) {
            return;
        }
        while (iterator != null) {
            iterator2 = iterator.getNext();
            iterator = null;
            length--;
            iterator = iterator2;
        }
    }

    @Override
    public T get(int index) {
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
            if (index == 0) { //index zero represents the node we want the data
                return (T) iterator.getData();
            }
            index--; //decrementing index, so we can reach index zero
        }
        return null; //return null if iterator == null or iterator.getData == null
    }

    @Override
    public int indexOf(T data) {
        int index = -1;
        Node iterator = head;

        while (iterator != null) {
            if (data.equals(iterator.getData())) {
                return index;
            }
            index++;
            iterator = iterator.getNext();
        }
        return -1; //represents we didn't find an indexOf with the Object data
    }

    @Override
    public T sublist(int fromIndex, int toIndex) {
        Node iterator = head.getNext();
        ListImp subList = new ListImp(); //create a new list to add the new elements

        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {
                subList.add((T) iterator.getData());
            }
            iterator = iterator.getNext();
        }
        return (T) subList;
    }

    @Override
    public String toString() {
        return "ListImp { " +
                "head = " + head +
                ", length = " + length +
                '}';
    }
}
