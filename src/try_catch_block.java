
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



import java.util.Scanner;

public class try_catch_block {
    public static void main(String[] args) {
        try{
            Scanner sc =new Scanner(System.in);
            int a=sc.nextInt();
        }catch(Exception obj){
            System.out.println(obj);
        }
       finally {
            System.out.println("Final Block Execute");

        }
    }
}






