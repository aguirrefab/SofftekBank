package services;

import dao.BankDAO;
import dao.IBankDAO;
import models.banks.Bank;

public class BankService implements IBankService{

    private IBankDAO bankDAO;


    public BankService(){
        this.bankDAO  = new BankDAO();
    }


    @Override
    public void addBankEntity(Bank bank) {
        bankDAO.addBankEntity(bank);
    }

    @Override
    public void deleteBankEntity(Bank bank) {
        bankDAO.deleteBankEntity(bank);
    }

    @Override
    public void updateBankEntity(Bank bank) {
        bankDAO.updateBankEntity(bank);
    }

    @Override
    public Bank findBankByEntityCode(Long entityCode) {
        return bankDAO.findBankByEntityCode(entityCode);
    }
}

