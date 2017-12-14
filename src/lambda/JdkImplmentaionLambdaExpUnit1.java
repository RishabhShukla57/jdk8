package lambda;


public class JdkImplmentaionLambdaExpUnit1 {
	 
	public static void main(String [] args){
		

		Runnable anonymousRun = new  Runnable(){
			public void run(){
				System.out.println("Anonymous Run");
				System.out.println(this);
			}
		};
		
		anonymousRun.run();
		
		Runnable lambdaRun = ()->System.out.println("Lambda Run");
		lambdaRun.run();
		
		//System.out.println("This reference : "+this);
		
		Runnable thisRun = () ->{
		//	System.out.println("this Run : "+this);
		};
		
		JdkImplmentaionLambdaExpUnit1 impl = new JdkImplmentaionLambdaExpUnit1();
		impl.checkThisReference();
	}
	
	
	void checkThisReference(){
		Runnable lambdaRunInst = ()->System.out.println("inside an intance method : "+this);
		lambdaRunInst.run();
	}

	
}
