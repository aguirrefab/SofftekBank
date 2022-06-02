package dao;

import java.util.List;

public interface DAO<T, K>  {
    void add(T customer);

    void delete(T dni);

    void modify(T customer);

    T findById(K String);

    List<T> listByBankEntityCode(Integer K);
    List<T> listBySubsidiaryId(Integer k);

}
