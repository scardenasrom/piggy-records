package herkiusdev.com.piggy_records.model;

public class AccountDTO {

    private String name;
    private float amount;

    public AccountDTO(){

    }

    public AccountDTO(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
