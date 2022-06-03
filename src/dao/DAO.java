package dao;

import java.sql.Connection;
import java.util.List;

public interface DAO<T>  {
    void add(T a);

    void delete(T a);

}
