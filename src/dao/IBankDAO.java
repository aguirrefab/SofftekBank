package dao;

import models.banks.Bank;

public interface IBankDAO {

    void deleteBank(Integer entityCode);

    void addEntityBank(Bank bank);

}
