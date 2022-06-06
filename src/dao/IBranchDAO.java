package dao;

import models.banks.Branch;

public interface IBranchDAO {

    Branch findBranchById(Long entityId);

}
