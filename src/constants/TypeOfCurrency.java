package constants;

public enum TypeOfCurrency {

    DOLLAR("USD", "United States dollar"),
    PESO_AR("ARS","Argentine peso");

    private String code;
    private String description;

    TypeOfCurrency(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
