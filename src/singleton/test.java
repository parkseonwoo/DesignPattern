package singleton;

import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		
		ConnectionPool instance1 = ConnectionPool.getInstance();		
		ConnectionPool instance2 = ConnectionPool.getInstance();

		System.out.println(instance1 == instance2);
		
		// singleton 
		Calendar calendar = Calendar.getInstance();
	}

}
