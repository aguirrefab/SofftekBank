package dao;

import models.banks.Bank;
import models.banks.Subsidiary;
import models.database.IDBConnection;

import java.util.ArrayList;
import java.util.List;

public class SubsidiaryDAO extends IDBConnection implements ISubsidiaryDAO {

    private List<Subsidiary> subsidiaries;
    private static SubsidiaryDAO instance;

    private SubsidiaryDAO() {
        this.subsidiaries = new ArrayList<>();
    }

    // Apply Singleton Pattern
    static public SubsidiaryDAO getInstance() {
        if (instance == null) {
            instance = new SubsidiaryDAO();
        }
        return instance;
    }

    @Override
    public void add(Subsidiary a) {

    }

    @Override
    public void delete(Subsidiary a) {

    }
}
