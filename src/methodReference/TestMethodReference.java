package methodReference;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestMethodReference {

	
	Map<Integer,User>  map =new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user= new User(1,23,"rishabh");
		//map.put(1,user);
		TestMethodReference testMethodReference = new TestMethodReference();
		Predicate<User> firstUserInf = (p)->TestMethodReference.userDetails(p);
		firstUserInf.test(user);
		Predicate<User> firstUserInfDup = TestMethodReference::userDetails;
		
		
		Function<Integer,User> secondUserInf = (p)-> testMethodReference.fetchUser(p);
		Function<Integer,User> secondUserInfDup = testMethodReference::fetchUser;
		firstUserInf.test(user);
		secondUserInfDup.apply(1);
		
		Function<User,String> thirdUserInf = (p)-> p.fetchUserInf();
		Function<User,String> thirdUserInfDup = User::fetchUserInf;
		System.out.println(thirdUserInfDup.apply(user));
		
		Consumer<String> fourthUserInf = (p)-> new User(p);
		Consumer<String> fourthUserInfDup =  String::new;
		fourthUserInf.accept(user.getName());
		
	}
	
	
	static boolean userDetails(User user){
		System.out.println("Providing the user details : "+user.getName());
		return true;
	}
	
	
	User fetchUser(int id){
		return map.get(id);
	}
	
	int fetchAge(User user){
		return user.getAge();
	}
	

}
class User{
	
	int id;
	int age;
	String name;
	
	User(){
		System.out.println("Default Constructor");
	}
	
	User(String name){
		this.id = Integer.MAX_VALUE;
		this.age = 0;
		this.name = name;
	}
	User(int id,int age,String name){
		this.id =id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	String fetchUserInf(){
		return "name : "+this.name+ " age : "+age;
	}
	
	
	
}
