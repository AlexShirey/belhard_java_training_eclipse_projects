import java.util.LinkedList;

public class Student {
	private String name;
	private int course;
	
	public Student(String name, int course){
		this.name = name;
		this.course = course;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCourse(){
		return this.course;
	}
	
	public static void printStudents(LinkedList students, int course){
		for (int i = 0; i < students.size(); i++){
			Student temp = (Student) students.get(i);
			if (temp.course == course){
				System.out.println(temp);			
			}
		}
	}
	
	public static LinkedList union(LinkedList set1, LinkedList set2){
		LinkedList unionLink = new LinkedList();
		Math.max(set1.size(), set2.size());
		unionLink.addAll(set1);
		
		return unionLink;
	}
	
	
	
	public String toString(){
		return "name " + name + ", course " + course;
	}

}
