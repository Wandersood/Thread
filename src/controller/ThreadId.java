package controller;

public class ThreadId extends Thread {
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("TID #" + getId ());
	}

	
	
	

}
