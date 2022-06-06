package services;


import dao.AccountDAO;
import dao.IAccountDAO;
import models.accounts.Account;

import java.util.List;

public class AccountService implements IAccountService {

    private IAccountDAO accountDAO;

    public AccountService(){
        this.accountDAO = AccountDAO.getInstance();
    }

    @Override
    public void addAccount(Account account) {
        accountDAO.addAccount(account);
    }

    @Override
    public void deleteSavingAccount(Account account) {
        accountDAO.deleteSavingAccount(account);
    }

    @Override
    public Account findAccountByCBU(Long CBU) {
        return accountDAO.findAccountByCBU(CBU);
    }

    @Override
    public List<Account> findAccountByDNI(Integer DNI) {
        return accountDAO.findAccountByDNI(DNI);
    }

    @Override
    public List<Account> listAccountByBankEntityCode(Integer entityCode) {
        return accountDAO.listAccountByBankEntityCode(entityCode);
    }

    @Override
    public List<Account> listAccountByBranchId(Integer entityId) {
        return accountDAO.listAccountByBranchId(entityId);
    }

    @Override
    public boolean depositInSavingAccount(Account account, double quantity) {
        Account accountTodeposit = accountDAO.findAccountByCBU(account.getCBU());

        if (accountTodeposit != null){
            accountDAO.depositInSavingAccount(accountTodeposit, quantity);
            return true;
        }
        return false;
    }

    @Override
    public boolean extractFromSavingAccount(Account account, double quantity) {
        Account accountToDeposit = accountDAO.findAccountByCBU(account.getCBU());

        if (accountToDeposit != null){
            accountDAO.extractFromSavingAccount(accountToDeposit, quantity);
            return true;
        }
        return false;
    }
    @Override
    public boolean transferToSavingAccount(Account accountOrigin, Account accountDestiny, double quantity) {

        accountDestiny = accountDAO.findAccountByCBU(accountDestiny.getCBU());

        if (accountDestiny != null){
            accountOrigin = accountDAO.findAccountByCBU(accountOrigin.getCBU());
            accountDAO.transferToSavingAccount(accountOrigin, accountDestiny, quantity);
            return true;
        }
        return false;
    }

    @Override
    public boolean depositInCheckingAccount(Account account, double quantity) {
        Account accountToDeposit = accountDAO.findAccountByCBU(account.getCBU());

        if (accountToDeposit != null){
            accountDAO.depositInCheckingAccount(accountToDeposit, quantity);
            return true;
        }
        return false;
    }

    @Override
    public boolean extractFromCheckingAccount(Account account, double quantity) {
        Account accountToDeposit = accountDAO.findAccountByCBU(account.getCBU());

        if (accountToDeposit != null){
            accountDAO.extractFromCheckingAccount(accountToDeposit, quantity);
            return true;
        }
        return false;
    }

    @Override
    public boolean depositInCheckingAccount(Account accountOrigin, Account accountDestiny, double quantity) {
        accountDestiny = accountDAO.findAccountByCBU(accountDestiny.getCBU());

        if (accountDestiny != null){
            accountOrigin = accountDAO.findAccountByCBU(accountOrigin.getCBU());
            accountDAO.transferToCheckingAccount(accountOrigin, accountDestiny, quantity);
            return true;
        }
        return false;
    }
}
