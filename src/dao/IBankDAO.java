package dao;


import models.banks.Bank;

public interface IBankDAO{

    void addBankEntity(Bank bank);

    void deleteBankEntity(Bank bank);

    void updateBankEntity(Bank bank);

    Bank findBankByEntityCode(Long entityCode);

}
