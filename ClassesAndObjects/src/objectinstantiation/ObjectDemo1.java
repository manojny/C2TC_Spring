package objectinstantiation;

public class ObjectDemo1 {

	public static void main(String[] args) {
	ObjectDemo1 obj1 = new ObjectDemo1();
	ObjectDemo1 obj2 = new ObjectDemo1();
	System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
	}

}
