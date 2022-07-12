package com.Threading;

class ShutDownHook extends Thread
{
    public void run()
    {
        
        System.out.println("Here goes the clean up code...");
    }
}




public class TestRuntimeHook {

    public static void main(String[] args) {
        
        ShutDownHook s=new ShutDownHook();
        Runtime.getRuntime().addShutdownHook(s);
        
        //Runtime.getRuntime().removeShutdownHook(s);

    }

}
