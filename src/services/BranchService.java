package services;

import dao.IBranchDAO;
import models.banks.Branch;

public class BranchService implements IBranchService{

    private IBranchDAO branchDAO;

    public BranchService(IBranchDAO branchDAO) {
        this.branchDAO = branchDAO;
    }

    @Override
    public void addBranch(Branch branch) {
        branchDAO.addBranch(branch);
    }

    @Override
    public void deleteBranch(Branch branch) {
        branchDAO.deleteBranch(branch);
    }

    @Override
    public Branch findBranchById(Long entityId) {
        return branchDAO.findBranchById(entityId);
    }
}
