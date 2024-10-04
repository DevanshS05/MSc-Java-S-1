public class Chain{
	Chain(){
		System.out.println("Calling the constructor");
	}
	Chain step1(){
		System.out.println("Method-1 called!");
		return this;
	}
	Chain step2(){
		System.out.println("Method-2 called!");
		return this;
	}
	Chain step3(){
		System.out.println("Method-3 called!");
		return this;
	}
	
	public static void main(String args[]){
		Chain ch = new Chain().step1().step2().step3();
	}
}
