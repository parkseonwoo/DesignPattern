package singleton;

public class ConnectionPool {
	
	// 유일한 인스턴스를 정적변수로 선언한다.
	private static ConnectionPool instance = new ConnectionPool();
	
	// default constructor는 public이기 때문에 private로 막아줌
	// 외부에서 생성할 수 없음
	private ConnectionPool() {}
	
	// 외부에서 사용할 수 있도로 제공해주는 역할
	// 클래스를 생성하지 않아도 호출이 가능
	public static ConnectionPool getInstance() {
		
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
}
