package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    int a=12, b=0;
    public static void main(String[] args) throws Exception {
      exceptionHandle(12,2);
      readfile("C:\\Users\\LENOVO\\IdeaProjects\\Java Practice\\src\\readfile.txt");

    } public static void exceptionHandle(int a,int b){
        int c;
        if(b==0){
            throw new ArithmeticException("Do not devide with zero");
        }
        else {
            c=a/b;
            System.out.println(c);
        }

    } public static void readfile(String filename) throws Exception{
        File file =new File(filename);
        FileReader fileReader=new FileReader(filename);
        if(filename.length()==0){
            throw new FileNotFoundException("file not found");
        }


    }
}
