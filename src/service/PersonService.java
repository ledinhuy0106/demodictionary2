package service;

public interface PersonService<T> {
    int findIndexByCode(int code);

    void add(T t);

    void update(T t, int code);

    void deleteByCode(int code);

    void print();

    void sort();
    }
