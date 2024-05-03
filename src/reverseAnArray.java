public class reverseAnArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Array reversal");
        int arr1[]=Array_Utility.arrayInput();
        arrayReversal(arr1);
        System.out.print("reverse array is: ");
        for(int i=0;i<arr1.length;i++){

            System.out.print(" "+arr1[i]);
        }
    }
    public static void arrayReversal(int arr[]){

     for(int i=0;i<arr.length/2;i++){
         int swap=arr[i];
         arr[i]=arr[(arr.length-1)-i];
         arr[(arr.length-1)-i]=swap;


     }

    }
}
