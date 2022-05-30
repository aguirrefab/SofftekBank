package DAO;

import Models.Banks.Bank;

public interface IBankDAO {

    void deleteBank(Integer entityCode);

    void addEntityBank(Bank bank);

}
