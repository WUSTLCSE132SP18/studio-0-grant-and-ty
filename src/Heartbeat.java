
public class Heartbeat {

	
	public static void main(String[] args) {
		System.out.println("boop boop");
		int i = 0;
		while ( i == 0) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("boop boop");
		}
	}
	
	
}
