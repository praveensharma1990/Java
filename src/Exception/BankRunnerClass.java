package Exception;

public class BankRunnerClass {
    public static void main(String[] args) throws CustomeExceptionDemo {
      Bank sbi=new Bank("INR",200);
      Bank AmericanExprss = new Bank("USD",1000);
      Bank ICICI = new Bank("INR",232);
        System.out.println(sbi.add(sbi));
        System.out.println(sbi.add(AmericanExprss));
        ICICI.add(ICICI);
       Integer num= ICICI.add(ICICI);
        System.out.println(num);

    }

}
