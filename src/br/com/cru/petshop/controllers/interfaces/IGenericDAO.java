package br.com.cru.petshop.controllers.interfaces;

import java.util.List;

public interface IGenericDAO<T> {
    void insertAndUpdate(T model);
    List<T> all();
}
