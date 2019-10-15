class InvalidUserException extends Exception{
	InvalidUserException(String s)
	{
	  super(s);
	}
}

class User
{
	String name,gender;
	int age,salary;
	void agever(String name,int age,int salary,String gender) throws InvalidUserException
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		if(age>=25 && salary>=500000)
			System.out.println("User Registration is Successfull");
		else
			throw new InvalidUserException("Invalid Bank User");
	}
}
public class Demo
{
	public static void main(String[] args) throws InvalidUserException {
		User g=new User();
		g.agever("suresh",27,5000000,"female");
	}
}