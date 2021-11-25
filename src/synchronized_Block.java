
class Table{
    void printTable(int n){
        synchronized (this){
            for(int i=0;i<=5;i++)
                try{
                    Thread.sleep(400);
                }catch(Exception e){
                    System.out.println(e);
                }
        }
    }
}

class Mythread1 extends Thread{

    Table t;
    Mythread1(Table t){
        this.t=t;

    }
    public void run(){
        t.printTable(5);
    }
}
class Mythread2 extends Thread{
    Table t;
    Mythread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

