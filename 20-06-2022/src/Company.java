class Employee{
	static int count;
			
}

class Admin extends Employee{
	Admin(){
		count++;
	}
}

class Manager extends Employee{
	Manager(){
		count++;
	}
}

public class Company {

	public static void main(String[] args) {
			Manager m = new Manager();
			Admin a = new Admin();
			Admin a1 =new Admin();
			Manager m1 = new Manager();
			
			
			Employee e = new Employee();
			System.out.println(Employee.count);	

	}
}


