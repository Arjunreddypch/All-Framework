package javaprograms;

public class MultiThreading extends Thread{
	
	public void run() {
		
			
			System.out.println("Hook Functionality");
			System.out.println("daemon Functionality");
	}
	
	public static void main(String[] args) {
		
		MultiThreading ml=new MultiThreading();
		ml.setDaemon(true);
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(ml);
		for(int i=0;i<100;i++) {
			
			System.out.println("main thread running"+i);
			
			if(i==5) {System.out.println();}
		}
		
		
	}

}
