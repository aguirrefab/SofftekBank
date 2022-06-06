package services;

import models.banks.Branch;

public interface IBranchService {

    void addBranch(Branch branch);
    void deleteBranch(Branch branch);

    Branch findBranchById(Long entityId);


}
