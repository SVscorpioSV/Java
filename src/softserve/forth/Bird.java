package softserve.forth;

public class Bird {
	
	public void sleep(){
		System.out.println("This bird can sleep");
	}
	
	public void eat(){
		System.out.println("This bird can eat");
	}
	
}
class Parrot extends Bird {
	   public void fly(){
	      System.out.println("This parrot can fly");
	   }
	}

class Penguin extends Bird {
	   public void jump(){
	      System.out.println("This penguin can jump");
	   }
}

