package persondetails;

		public class Student {
			  String firstName;
			  String lastName;
			  char gender;
			  int age;
			  float weight;
			  int number;
			  long phonenumber;
			  
			  //constructor
			  public Student(String firstName, String lastName, char gender, int age, float weight,long phonenumber){
			      this.firstName = firstName;
			      this.lastName = lastName;
			      this.gender = gender;
			      this.age = age;
			      this.weight = weight;	
			      this.phonenumber = phonenumber;
			     
			  }
			  
			  void disp()
			  {
				    System.out.println("firstname: " +firstName);
				    System.out.println("last name: "+lastName);
				    System.out.println("gender: " +gender);
				    System.out.println("age: " + age);
				    System.out.println("weight: " +weight);
				    Student();
				   
			  }
			  void Student() {
				  System.out.println("phonenumber: "+ phonenumber);
			  }
			 
			  
			  public static void main(String args[]) {
			    Student myStudent = new Student("raj", "kumar", 'M', 25, 60.5f,987654321);
			    
			   myStudent.disp();
			    
			  }

			}
		

	


