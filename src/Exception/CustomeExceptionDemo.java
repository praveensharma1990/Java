package Exception;

public class CustomeExceptionDemo extends Exception{
  public   CustomeExceptionDemo(String msg){
      super(msg);
      System.out.println("This is custome exception");
  }
}
