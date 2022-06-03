package constants;

public enum TypeOfAccount {

    SAVING_ACCOUNT(101, "Saving Account"),
    CHECKING_ACCOUNT(202, "Checking Account");

    private Integer accountCode;
    private String descriptionAccount;

    TypeOfAccount(Integer accountCode, String descriptionAccount) {
        this.accountCode = accountCode;
        this.descriptionAccount = descriptionAccount;
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getDescriptionAccount() {
        return descriptionAccount;
    }

    public void setDescriptionAccount(String descriptionAccount) {
        this.descriptionAccount = descriptionAccount;
    }
}
