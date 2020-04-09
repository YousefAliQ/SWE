package calculation;


public class Calculator {
    private int value=0;
    
    public Calculator() {
		value =0;
	}
    public Calculator(int value) {
		this.value =value;
	}

	public int add(int number) {
    	value = value + number;
        return value;
    }

    public int subtract (int number) {
    	value = value - number;
        return value;
    }

	public int getValue() {
		return value;
	}
	public int multiply(int number) {
		value = value * number;
        return value;		
	}  
}
