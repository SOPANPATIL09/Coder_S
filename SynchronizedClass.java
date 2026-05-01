public class SynchronizedClass{
    public static void main(String args[]){
        Counter counter =new Counter();
        
        Mythread t1=new Mythread(counter);
        Mythread t2=new Mythread(counter);
        
        t1.start();
        t2.start();
        try{
        t2.join();    
        t1.join();}
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }

}
class Counter{
    
    private int count =0;
    
    public synchronized void increment(){
        count++;
    }
    
    public int getCount(){
        return count;
    }
}
class Mythread extends Thread{
    
    private Counter counter;
    
    public Mythread(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}