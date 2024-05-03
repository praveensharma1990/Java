import java.util.*;

class MissingNumberUsingXOR1 {
    public static void main(String args[]) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sp.nextInt();  // Size of array
        int arr[] = new int[n];

        System.out.println("Enter " + (n-1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sp.nextInt();
        }

        int XOR1 = arr[0];
        for (int i = 1; i < n - 1; i++) {
            XOR1 ^= arr[i];
        }

        int XOR2 = 1;
        for (int i = 2; i <= n; i++) {
            XOR2 ^= i;
        }

        System.out.println("Missing number: " + (XOR1 ^ XOR2));
    }
}
