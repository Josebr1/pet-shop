package br.com.cru.petshop.controllers.interfaces;

import java.util.List;

public interface IGenericDAO<T> {
    T findById(int id);
    void insertAndUpdate(T model);
    List<T> all();
}
