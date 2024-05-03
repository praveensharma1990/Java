import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondLargestNum {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter the length of Array ");
        int array_length=input.nextInt();
        int arr[]=new int [array_length];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Element for "+(i+1) +" Element ");
            arr[i]= input.nextInt();

        }
      arrayReverse(arr);
        System.out.println();
      Boolean ispelindrom=Ispelindrom(arr);
        if(ispelindrom){
            System.out.println("number is pelindrom");
        } else{
            System.out.println("number is not pelindrom");
        }
    }  public static void arrayReverse(int []arr){
        int swap;
        for(int i=0;i<arr.length/2;i++){
            swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
        }
        System.out.print("Reversed Array is ");
         for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
     }



    } public static Boolean Ispelindrom(int arr[]){
      for(int i=0;i<arr.length/2;i++)
      if(arr[i]==arr[arr.length-1]-i){
          return true;
      }
     return false;
    }




}
