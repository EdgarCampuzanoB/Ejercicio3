package test;

import threads.PrintMe;

public class ThreadTester {

    public static void main(String[] args){
        PrintMe p1 = new PrintMe();
        PrintMe p2 = new PrintMe();
        PrintMe p3 = new PrintMe();

        Thread t = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t.start();
        t2.start();
        t3.start();




    }
}
