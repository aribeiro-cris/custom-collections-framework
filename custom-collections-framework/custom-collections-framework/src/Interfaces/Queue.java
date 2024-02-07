package Interfaces;

public interface Queue<T> extends Collection<T> {

    boolean offer(T data);

    T peek();

    T poll();

}
