package domain.oracle.com;

public class Count {
	
	private int value;

	public Count() {
		this.value = 0;
	}

	public void increment() {
		value +=1;
		
	}

	public Object value() {
		return value;
	}

}