package com.Threading;

class Worker implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+",");
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
	}
	
}


 class ThreadUsingRunnableInterface {

	public static void main(String[] args) {
		Worker t=new Worker();
		Thread thread=new Thread(t);
		
		thread.start();
		

	}

}