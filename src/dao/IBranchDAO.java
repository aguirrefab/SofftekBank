package dao;

import models.banks.Branch;

public interface IBranchDAO {

    void addBranch(Branch branch);
    void deleteBranch(Branch branch);

    Branch findBranchById(Long entityId);


}
