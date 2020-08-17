
public class Cats extends Animals {
	private int countMouses;

	public Cats(){
		
	}
	
	public Cats(int weigth, int age, String name, int countMouses){
		super(weigth, age, name);
		this.countMouses = countMouses;
	}
	
	public void show(){
		super.show();
		System.out.print(countMouses + " countMouses");
	}
	
	public int getCountMouses() {
		return countMouses;
	}

	public void setCountMouses(int countMouses) {
		this.countMouses = countMouses;
	}

}
