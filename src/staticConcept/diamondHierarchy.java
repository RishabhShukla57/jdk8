package staticConcept;

public class diamondHierarchy extends Humans implements HumanBeing,Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void langugage() {
		// TODO Auto-generated method stub
		System.out.println("Implement interface abstract method " + this.getClass());
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println("Deadly diamond of Death Scenario");
		
	}
	// Need not overide the static method of implemented interface

}


class Humans{
	
	 void speak(){
		System.out.println("Hello , this method to test the priority of class metho & interface"+this.getClass());
	}
}


@FunctionalInterface
interface HumanBeing{
	static void walk(){
		System.out.println("Hello World , This is interface");
	}
	default void speak(){
		System.out.println("Hello ,This is default method of interface" +this.getClass());
	}
	void langugage();
	
	/*
	default boolean equals(Object obj){
		
	}*/
}

interface Animal{
	default void speak(){
		System.out.println("Hello ,This is default methos of interface"+this.getClass());
	}
}



