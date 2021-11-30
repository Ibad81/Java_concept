
//public class try_catch_block{
//    public static void main(String[] args) {
//        try{
//            System.out.println(50/0);
//        }catch (Exception obj){
//
//            System.out.println(obj);
//        }
//    }
//}

//
//
//import java.util.Scanner;
//
//public class try_catch_block {
//    public static void main(String[] args) {
//        try{
//            Scanner sc =new Scanner(System.in);
//            int a=sc.nextInt();
//        }catch(Exception obj){
//            System.out.println(obj);
//        }
//       finally {
//            System.out.println("Final Block Execute");
//
//        }
//    }
//}

//public class try_catch_block {
//    public static void main(String[] args) {
//        int i=50;
//        int j=0;
//
//        try{
//            int data=i/j;
//        }
//        catch(Exception e){
//            int data=i/0;
//
//        }
//        System.out.println("rest of code");
//    }
//}
//
//import java.util.Scanner;
//
//public class public class try_catch_block {
//    public static void main(String[] args) {
//        try{
//            Scanner sc =new Scanner(System.in);
//            int a=sc.nextInt();
//        }catch(Exception obj){
//            System.out.println(obj);
//        }
//       finally {
//            System.out.println("Final Block Execute");
//
//        }
//    }
//}



//public class try_catch_block{
//    public static void main(String[] args) {
//        try{
//            int data =50/0;
//        }catch( StringIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of code");
//    }
//}


//public class try_catch_block{
//    public static void main(String[] args) {
//        try{
//            int arr[]={1,2,3};
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code");
//    }
//
//}

//TO SAVE THE FILE IN ANY FOLDER

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class try_catch_block{
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw=new PrintWriter("java.txt");
            pw.println("Saved");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File Saved Sucessfully");
    }
}






