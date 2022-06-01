package dao;

import java.util.List;

public interface DAO<T, K>  {
    void add(T customer);

    void delete(T dni);

    void modify(T customer);

    T findById(String dni);

    List<T> listByBankEntityCode(K entityCode);

    List<T> listBySubsidiaryId(K entityId);


}
