package objectinstantiation;

class Employee{
	String ename;
	int age;
	double salery;
	public Employee(String ename, int age, double salery) {
		super();
		this.ename = ename;
		this.age = age;
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", salery=" + salery + "]";
	}
	
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("kiran",35,35000.00);
		Employee e2 = new Employee("hira",40,40000.00);
		Employee e3 = new Employee("hiran",45,45000.00);
		
		System.out.println(e1 + " " + e2 + " "+e3 );
		
/*System.out.println(e1.equals(e2));
System.out.println(e1==e2);
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());/*

/*System.out.println(e2.hashCode());
System.out.println(e3.hashCode());*/

	}

}
