package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIImplementation {

	public static void main(String [] args){
		
		aggregateStreamFunction();
		
	}
	
	static void aggregateStreamFunction(){
		//Playing with Collection & Stream API
		List<Person> list = new ArrayList<>();
		list.add(new Person(23,"sat"));
		list.add(new Person(25,"rishabh"));
		list.add(new Person(27,"indian"));
		list.stream().map(p->p.getName()).filter(p->p.length()>4).sorted().forEach(p->System.out.println(p));
		
		
		//Playing with Arrays & Stream API
		Person [] stEmployee = new Person[3];
		stEmployee[0] = new Person(12,"stmicroelerctronics");
		stEmployee[1] = new Person(36,"sterricson");
		//stEmployee[2] = new Person(13,"sterricson");
		List<Integer> stList = Arrays.stream(stEmployee, 0, 2).map(p->p.getAge()).collect(Collectors.toList());
		stList.stream().forEach(p->System.out.println("age is :"+ p));
		System.out.println(Arrays.stream(stEmployee,0,2).map(p->p.getAge()).reduce(1,(p,q)->p*q/*,(x,y)->x+y)*/));
		
	}
	
	
}

class Person{
	int age;
	String name;
	Person(){
		
	}
	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
