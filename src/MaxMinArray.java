public class MaxMinArray {

    public static void main(String[] args) {
        System.out.println("Welcome to find the maximum and minimum in Array Elements: ");
        int arrayNum[] = Array_Utility.arrayInput();
        int min=minimumInArray(arrayNum);
        int max=maximumInArray(arrayNum);
        System.out.println("Minimum value in array is "+min);
        System.out.println("Maxium value in array is "+max);

    }

    public static int minimumInArray(int Arr[]) {
        if(Arr.length==0){
            return Integer.MIN_VALUE;
        }

        int minimum = Arr[0];
        for (int i = 0; i < Arr.length; i++) {

            if(Arr[i]<minimum){
                minimum=Arr[i];
            }
        }
        return minimum;
    }
    public static int maximumInArray(int Arr[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < Arr.length; i++) {
            if(maximum<Arr[i]){
                maximum=Arr[i];
            }
        }
        return maximum;

    }
}