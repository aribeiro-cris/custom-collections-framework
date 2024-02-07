package Interfaces;

public interface List<T> extends Collection<T> {
    T get (int index);
    int indexOf(T data);
    T sublist(int fromIndex, int toIndex);

}
