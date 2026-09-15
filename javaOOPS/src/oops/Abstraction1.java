package oops;
interface Area{
	void area();
}
class Rectangle implements Area{
	public void area() {
		int length=10;
		int breadth=20;
		System.out.println("area of rectangle:"+length*breadth);
	}
}
class Square implements Area{

	@Override
	public void area() {
		int s=10;
		System.out.println("area of square:"+s*s);
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
	
Area a1=new Rectangle();
Area a2=new Square();
a1.area();
a2.area();
	}

}
