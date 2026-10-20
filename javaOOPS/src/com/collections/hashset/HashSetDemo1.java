package com.collections.hashset;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/*"When we create custom objects, Java's default equality behavior does not necessarily compare their field values. "
+ "We override equals() to define logical equality and hashCode() to ensure equal objects produce the same hash code. "
+ "HashSet uses the hash code to locate candidate elements and equals() to check for duplicates. "
+ "Overriding both methods correctly ensures that logically equal objects are treated as duplicates."*/
class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
public class HashSetDemo1 {

	public static void main(String[] args) {
		Set set=new HashSet();
		Employee e1=new Employee(101,"vivek");
		Employee e2=new Employee(101,"vivek");
		set.add(e1);// this calls hashcode() and equals()
		set.add(e2);
		//You didn't explicitly call toString(), but Java's printing mechanism converts the set to a string.
		//System.out.println(set.toString());
		System.out.println(set);

	}

}
