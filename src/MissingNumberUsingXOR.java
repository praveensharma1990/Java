import java.util.*;
public class MissingNumberUsingXOR {
    public static void main(String args[]){
        Scanner sp = new Scanner(System.in);
        System.out.print("enter size of array ");
        int n = sp.nextInt();  //size of array
//        n+=1;
        int arr[] = new int[n];
        for(int i=0; i<n-1; i++){
            System.out.print("enter "+(i+1)+ " element ");
            arr[i] = sp.nextInt();
        }
        System.out.println();
        int XOR1 = arr[0];
        int XOR2 = 1;
        for(int i=1; i<n-1; i++){
            XOR1^=arr[i];

        }
        for(int i=2; i<=n; i++){
            XOR2^=i;
        }
        System.out.println(XOR1-XOR2);


    }
}
