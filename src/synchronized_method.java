class Amount1{
    int balance;
    public Amount1()
    {
        int balance=1000;
    }
    public void  withdraw(int amt){
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException obj){

        }
        balance=balance-amt;
        System.out.println(balance);
    }
}

class Mythread extends Thread{
    Amount1 obj;
    public Mythread(Amount1 tobj){
        obj=tobj;
    }
    public void run(){
        obj.withdraw(500);
    }
}
class Synchronized_method {

    public static void main(String[] args) {
        Amount1 obj =new Amount1();
        Mythread obj1=new Mythread(obj);
        Mythread obj2=new Mythread(obj);
        obj1.start();
        obj2.start();
    }
}