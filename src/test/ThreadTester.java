package test;

import threads.PrintMe;

public class ThreadTester {

    public static void main(String[] args){
        PrintMe p1 = new PrintMe();
        PrintMe p2 = new PrintMe();
        PrintMe p3 = new PrintMe();


        Thread t = new Thread(p1);
        t.start();

        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();




    }
}
