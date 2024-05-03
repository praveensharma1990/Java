import java.util.Scanner;
public class Array_Utility {

    public static int[] arrayInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter How Many Elements do you want in array ");
        int arrayNum = input.nextInt();
        int arry[] = new int[arrayNum];
        for (int i = 0; i < arrayNum; i++) {
            System.out.println("Please Enter the number for elements " + (i + 1));
            arry[i] = input.nextInt();

        }
        return arry;


    }
}