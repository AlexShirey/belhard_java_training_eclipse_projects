package Throws;

public class MyExceptions extends Exception{
	public String nameError;
	public int i;
	
	public MyExceptions (String name){
		this.nameError = name;
		
	}
	
	public MyExceptions (int i){
		this.i = i;
		
	}

	@Override
	public String toString() {
		return nameError;
	}

}
