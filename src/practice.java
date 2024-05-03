import java.util.Scanner;

public class practice {

    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {
        swap_Num(1,2);
        System.out.println("please enter the size of Array");
        int array_size=input.nextInt();
        int arr[]=new int[array_size];

        for(int i=0;i<array_size;i++){
            System.out.print("Please enter the number for "+(i+1)+" Element ");
            arr[i]=input.nextInt();
        } for(int array_travarsal :arr){
            System.out.println("your array elements are "+array_travarsal);
        }
        System.out.println("Enter the Number of Rows");
        int row=input.nextInt();
        System.out.println("Enter the number of Column");
        int column=input.nextInt();
        twoDarray(row,column);
        if(isPrimeNum(88))
        {
         System.out.println("num is prime");
        }else {
            System.out.print("Not Prime");

        }
    } public static void swap_Num(int a, int b){
        System.out.println("value of a "+a);
        System.out.println("value of b "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("AFTER SWAP");
        System.out.println("value of a "+a);
        System.out.println("value of b "+b);
    } public static void twoDarray(int row, int column){
        int arr2D[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2D[i][j]= input.nextInt();
            }
        }
    }public static boolean isPrimeNum(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
