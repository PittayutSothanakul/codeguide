#codeguide Pittayut Sothanakul 5910546678

#DRY (Don't repeat yourself)
It mean don't write duplicate code
Duplicate code is a computer programming term for a sequence of source code that occurs more than once, either within a program or across different programs owned or maintained by the same entity.  Duplicate code is generally considered undesirable for a number of reasons.
 
	-Example

		public class Student {
			String name;
			int age;
			public String toString() {
				name = "panther";
				age = 18;
				return "Name : " + name + "\nage : " + age;
			}
		}

	

	-You can write
 
		public class Student {
			String name = "panther";
			int age = 18; 
			public String toString(){
				return "Name : " + name + "\nage : " + age;
			}
		}



	-Reference : https://en.wikipedia.org/wiki/Don't_repeat_yourself

#Encapsulate
In programming languages, encapsulation is used to refer to one of two related but distinct notions, and sometimes to the combination.

- A language mechanism for restricting direct access to some of the object's components
- A language construct that facilitates the bundling of data with the methods (or other functions) operating on that data.

	-Example

		public class Student{

			private String name;
	
			public String getName(){
				return name;
			}	
			
			public void setName(String name){
				this.name = name;
			}
		}	
	

		public class RunEncap{
			public static void main(String args[]){
				Student stu = new Student();
				stu.setName("Panther");
			
				System.out.print("Name : " + stu.getName());
 			}
		}

	-Reference : https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)
		      https://www.tutorialspoint.com/java/java_encapsulation.htm

