import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Studnet List (ordered by name)");
		Student s1 = new Student("Kim",23,101);
		al.add(s1);
		Student s2 = new Student("Lee",21,102);
		al.add(s2);
		Student s3 = new Student("Park",22,103);
		al.add(s3);
		Student s4 = new Student("Sin",24,104);
		al.add(s4);
		Student s5 = new Student("Moon",25,105);
		al.add(s5);
		Student s6 = new Student("Yoo",28,106);
		al.add(s6);
		Student s7 = new Student("Kim",29,107);
		al.add(s7);
		Student s8 = new Student("Lee",14,108);
		al.add(s8);
		Student s9 = new Student("Park",32,107);
		al.add(s9);
		Student s10 = new Student("Do",50,108);
		al.add(s10);
		
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al,Collections.reverseOrder());
		
		for (int i = 0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
		
	}

}
