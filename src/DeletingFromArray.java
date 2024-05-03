import java.util.Scanner;

public class DeletingFromArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion Program ");
        int numarr[] = Array_Utility.arrayInput();
        System.out.println("Enter the number you want to delete:");
        int num_tobe_deleted = input.nextInt();
        int arr2[] = elementDeletionFromArray(numarr, num_tobe_deleted);
        System.out.println("Your New Array is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] elementDeletionFromArray(int arr[], int num) {
        int occurrence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                occurrence++;
            }
        }
        int newSizeOfArray = arr.length - occurrence;
        int arr1[] = new int[newSizeOfArray];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }
}
