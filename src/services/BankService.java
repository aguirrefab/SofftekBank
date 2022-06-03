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
    public void addBank(Bank bank) {
        bankDAO.add(bank);

    }
    @Override
    public Bank findBankById(Integer entityCode) {
        return bankDAO.findBankByEntityCode(entityCode);

    }
}

