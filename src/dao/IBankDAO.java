package dao;


import models.banks.Bank;

public interface IBankDAO{

    Bank findBankByEntityCode(Long entityCode);
    void updateBankEntity(Bank bank);


}
