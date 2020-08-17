package Page243;

public class Test <T extends Number, V extends Number>{
	public T a;
	public V b;

	
	public Test(T a, V b) {
		this.a = a;
		this.b = b;
	}
	
	public double summ(Test<T, V> ob2){
		double summ;
		summ = this.a.doubleValue() + ob2.b.doubleValue();
		return summ;
		
	}
	
//	public static void eq(Test<T, V>[] ob1, Test<T, V>[] ob2){
//		System.out.print("Hello");
//	}
	

	
	
	
	

}
