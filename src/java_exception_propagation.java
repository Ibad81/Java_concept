public class java_exception_propagation {
    void m(){
        int data=20/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        java_exception_propagation obj=new java_exception_propagation();
        obj.p();
        System.out.println("normal flow");
    }

}
