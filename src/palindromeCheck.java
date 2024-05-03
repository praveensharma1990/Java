import java.util.Scanner;

public class palindromeCheck {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the name to check ");
        String name=input.next();
     boolean ispalindromcheck=isPalindrom(name);
     if(ispalindromcheck){
         System.out.println("Stirng is palindrome");
     }
   else{
         System.out.println("not palindrome");
     }

    } public static boolean isPalindrom(String name){
        StringBuilder name1=new StringBuilder(name);
        name1.reverse();
        return name.equalsIgnoreCase(name1.toString());
    }
}
