package domain.oracle.com;

public class Count {
	
	private int value;

	public Count() {
		this.value = 0;
	}

	public void increment() {
		value +=2;
		
	}

	public Object value() {
		return value;
	}

}