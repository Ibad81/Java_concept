import java.util.Scanner;

public class finalize_method {
    public static void main(String[] args) {
        String s = "123s";
        try{
            int i = Integer.parseInt(s);
            System.out.println("Try block executed ");
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Block Executed");
        }
    }
}
