public class GenericsDemo {
   public static <T> void temp(T printAnyDataType) {

       System.out.println(printAnyDataType);
   }

    public static void main(String[] args) {
        temp(123);
        temp("Praveen");
        temp(23.4);
        temp('H');
    }


}
