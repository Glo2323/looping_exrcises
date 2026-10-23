package com.pluralsight;

public class ForLoop {

    //!Creating main method
    public static void main(String[] args) throws InterruptedException {


        //*For loop to print out I love java
        for ( int i = 10; i >= 1; i-- ) {

            Thread.sleep(1000);

            System.out.println(i);


            if (i == 1){
                System.out.println("Launch!!!");
            }
        }


    }
}
