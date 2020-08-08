package schoolapp.src.main.java;

import java.util.Object

public class Student {
	private String rollno;
	private int age;

	public Student(String rollno, int age) {
		this.rollno = rollno;
		this.age = age;

	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash = rollno.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object object)  {
		if(this==obj)
		{
			return true;
		}
		if(!(obj instanceof Student))  {
			return false;
			
			
		}
		Student other = (Student) obj;
		if(other.age%2==0); 
		{
			sub1.add(other);
			
		}
		else
		{
			sub2.add(other);
		}
		
	}

}
