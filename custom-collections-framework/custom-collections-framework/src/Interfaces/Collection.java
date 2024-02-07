package Interfaces;

public interface Collection<T> {

    int size();
    boolean add(T data);

    boolean remove(T data);

    boolean contains(T data);

    boolean isEmpty();

    void clear();


}
