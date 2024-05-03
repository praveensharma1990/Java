public class IsArrayShorted {

public static void main(String[] args) {
        int arr[]=Array_Utility.arrayInput();
      boolean incres=isIncreasing(arr);
      boolean decrease=isdecreasing(arr);
      if(incres||decrease){
          System.out.println("Array is shorted");
      } else{
          System.out.println("Array is not shorted");
      }

    }
    public static boolean isIncreasing(int Arr[]){
        // int num1=Arr[0];
        for(int i=1;i<Arr.length;i++){

            if(Arr[i]<=Arr[i-i]){

                return false;
            }
            }
                return true;
        }
    public static boolean isdecreasing(int Arr[]){
          for(int i=1;i<Arr.length;i++){

            if(Arr[i]>=Arr[i-i]){

                return false;
            }
        }
        return true;
    }


    }

