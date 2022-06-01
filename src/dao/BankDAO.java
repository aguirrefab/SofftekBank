package dao;

import models.banks.Bank;

import java.util.List;

public class BankDAO implements IBankDAO{

    @Override
    public void add(Bank customer) {

    }

    @Override
    public void delete(Bank dni) {

    }

    @Override
    public void modify(Bank customer) {

    }

    @Override
    public Bank findById(String dni) {
        return null;
    }

    @Override
    public List<Bank> listByBankEntityCode(Integer entityCode) {
        return null;
    }

    @Override
    public List<Bank> listBySubsidiaryId(Integer entityId) {
        return null;
    }
}
