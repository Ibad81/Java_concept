//import java.io.IOException;
//
//public class Test_Throws {
//    void m()throws IOException{
//        throw new IOException("device error ");
//    }
//    void n()throws IOException{
//        m();
//    }
//    void p(){
//        try{
//            n();
//        }catch(Exception e){
//            System.out.println("Exception Handled");
//        }
//    }
//
//    public static void main(String[] args) {
//        Test_Throws obj=new Test_Throws();
//        obj.p();
//        System.out.println("normal Flow...");
//    }
//}


import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("device error ");
    }
}
class Test_Throws{
    public static void main(String[] args) throws IOException {
        M m=new M();
        m.method();
        System.out.println("normal flow...");
    }
}