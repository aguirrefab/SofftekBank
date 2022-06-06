package dao;

import models.banks.Branch;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BranchDAO implements IBranchDAO {

    private static BranchDAO instance;

    private BranchDAO() {}

    // Apply Singleton Pattern
    public static BranchDAO getInstance() {
        if (instance == null) {
            instance = new BranchDAO();
        }
        return instance;
    }

    public void addBranch(Branch branch) {
        try {
            String query = "INSERT INTO branches(city, address) VALUES(?, ?, ?)";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setString(2, branch.getCity());
            prStmt.setString(3, branch.getAddress());

            prStmt.executeUpdate(query);

            prStmt.close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void deleteBranch(Branch branch) {
        try {
            String query = "DELETE FROM branches WHERE entity_id = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setLong(1, branch.getEntityId());

            prStmt.executeUpdate(query);

            prStmt.close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Branch findBranchById(Long entityId) {

        Branch branch;
        try {
            String query = "SELECT * FROM branches WHERE entity_id = ?";
            PreparedStatement prStmt = DataConnection.getConnection().prepareStatement(query);
            DataConnection.getConnection().setAutoCommit(false);

            prStmt.setLong(1, entityId);
            ResultSet rs = prStmt.executeQuery(query);

            if (rs.next()){
                branch = new Branch();
                branch.setEntityId(rs.getLong(1));
                branch.setCity(rs.getString(2));
                branch.setAddress(rs.getString(3));
                return branch;
            }
            prStmt.close();
            rs.close();

        } catch (SQLException ex) {
            try {
                DataConnection.getConnection().rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                DataConnection.getConnection().close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}