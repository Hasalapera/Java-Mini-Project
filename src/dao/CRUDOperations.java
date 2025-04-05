package dao;

public interface CRUDOperations<T> {
    void add(T t);
    void update(T t);
    void delete(int id);
    T get(int id);
}

