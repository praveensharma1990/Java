package Exception;

import java.rmi.UnexpectedException;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public Integer add(Bank bankName) throws CustomeExceptionDemo {
       if(!(bankName.currency.equalsIgnoreCase("INR")))
           throw  new CustomeExceptionDemo("USD Can not be added in INR");
        Integer sum= this.amount+ bankName.amount;
        return sum;
    }
}
