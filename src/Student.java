
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int no;
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", no=" + no + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name, int age, int no) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
	}
	
}
