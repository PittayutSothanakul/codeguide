package codeguide;

/*
 *  The main class create the student and print name , student id and age.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class RunEncap {
	/*
	 * main for print student name id and age.
	 */
	public static void main(String[] args) {

		Encap stu1 = new Encap();
		stu1.setName("Pittayut");
		stu1.setAge(18);
		stu1.setIdNum("5910546678");
		// TODO print student name , student id and age of stu1.
		System.out.print("Student name : " + "\nStudent id is : " + "\nAge : ");

	}
}
