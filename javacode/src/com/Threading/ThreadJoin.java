package com.Threading;

class TaskWork extends Thread{
	 private long  sleep;
	 private int sum;
	 
	 public TaskWork(long sleep) {
		 this.sleep=sleep;
		 
	 }
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			sum=sum+i;
			
	
			try {
				Thread.sleep(sleep);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public int getSum(){
		return this.sum;
	}
}



public class ThreadJoin {
	public static void main(String arg[]) {
		TaskWork t1=new TaskWork(1000);
		TaskWork t2=new TaskWork(2000);
		TaskWork t3=new TaskWork(2000);
		
		t1.start();
		try {
			t2.join();
			System.out.print(t1.getSum());
		}
		catch(InterruptedException e)
		{
			e.getStackTrace();
		}
		t2.start();
		try {
			t3.join();
			System.out.print(t1.getSum());

		}
		catch(InterruptedException e)
		{
			e.getStackTrace();
		}
		t3.start();
		
	
}

}
