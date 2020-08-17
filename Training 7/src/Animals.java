
public class Animals {
	private int weigth;
	private int age;
	private String name;

	public Animals() {

	}

	public Animals(int weigth, int age, String name) {
		this.weigth = weigth;
		this.age = age;
		this.name = name;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(weigth + " weigth " + age + " age " + name + " name");
	}

}
