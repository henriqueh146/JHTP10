public class EmployeeQ313{

	String name;
	String lastName;
	double salary;

	public EmployeeQ313(String name, String lastName, double salary){
		this.name = name;
		this.lastName = lastName;
		if(salary >= 0.0)
			this.salary = salary;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setSalary(double salary){
		if(salary >= 0.0)
			this.salary = salary;
	}

	public double getSalary(){
		return salary;
	}
}