package Page243;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer, Double> ob = new Test <Integer, Double>(6, 5.0);
		Test<Integer, Double> ob2 = new Test <Integer, Double>(5, 7.5);
		
		double x = ob.summ(ob2);
		System.out.println(x);
		
		//Test<Integer, Double> [] mass1 = new Test <Integer, Double> [5];
		
//		Test <Integer, Double> [] mass = {5, 6};
//		Integer[] mass2 = {5, 6};
//		
//		Test.eq(mass, mass2);
		

	}

}
