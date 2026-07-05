package in.coderarmy;

public class Calculator {
     int a;
     int b;
     private static Calculator calculator = null;

     //1. draw back is eagerly initlize the method
     //private static Calculator obj = new Calculator();

     private Calculator() {
         System.out.println("instance check");
     }

     public int sum(){
         return a+b;
     }


     //but problem here is of multithreding
//     public static Calculator getInstance() {
//        if(calculator == null){
//            calculator = new Calculator();
//        }
//        return calculator;
//     }

     //we use syncronised keyword for this for multithreadinf


    //this solve multithreading but issue is when after a thread is created
    //we also apply syncronised make it
    //slow to return the singleton obj
//    public synchronized static Calculator getInstance(){
//         if(calculator == null){
//             calculator = new Calculator();
//         }
//         return calculator;
//    }

    //now using double locking mechanism

    public static Calculator getInstance(){
         if(calculator == null){//then only apply lock
             synchronized (Calculator.class){
                 if(calculator == null){//check the obj is still null or not
                     calculator = new Calculator();
                 }
             }
         }
         return calculator;
    }
}
