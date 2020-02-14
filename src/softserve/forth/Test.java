package softserve.forth;

public class Test {

	public static void main(String[] args){
		
	      System.out.println("Parrot");
	      Parrot myParrot = new Parrot();
	      myParrot.sleep();
	      myParrot.eat();
	      myParrot.fly();
	    
		 
	      System.out.println("\n"+"Penguin");
	      Penguin myPenguin = new Penguin();
	      myPenguin.sleep();
	      myPenguin.eat();
	      myPenguin.jump();
   }
}
