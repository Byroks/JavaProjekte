class badAnimals {

	public static void printAnimalMoving(Animal a)
	
		{
		a.move();
	
//		if (a instanceof Crab)
//			((Crab)a).move();
//		else if (a instanceof Worm)
//			((Worm)a).crawl();
//		else if (a instanceof Bird)
//			((Bird)a).fly();
//		else if (a instanceof Cheetah)
//			((Cheetah)a).run();
//		else if (a instanceof Sloth)
//			((Sloth)a).hang();
//		else
//			System.out.println("I'm an Animal, I just move.");
	}
	public static void main(String[] Args)
	{
		Animal a = new Animal();
		Crab c = new Crab();
		Worm w = new Worm();
		Bird b = new Bird();
		Cheetah ch = new Cheetah();
		Sloth s = new Sloth();
		
		printAnimalMoving(a);
		printAnimalMoving(b);
		printAnimalMoving(c);
		printAnimalMoving(w);
		printAnimalMoving(ch);
		printAnimalMoving(s);
	}
}
		

class Animal {
	
	public void move()
	{
		System.out.println("I'm an Animal, I just move.");
	}
	
}

class Crab extends Animal {
	public void move()
	{
		System.out.println("Crabs scuttle.");
	}
}

class Worm extends Animal {
	
	public void move()
	{
		System.out.println("Worms crawl.");
	}
}

class Bird extends Animal {
	public void move()
	{
		System.out.println("Birds fly.");
	}
}

class Cheetah extends Animal {
	public void move()
	{
		System.out.println("Cheetah run.");
	}
}

class Sloth extends Animal {
	public void move()
	{
		System.out.println("Sloths don't move!");
	}
}





//class badAnimals {
//
//	public static void printAnimalMoving(Animal a)
//	{
//		if (a.ani==1)
//			((Crab)a).scuttle();
//		else if (a.ani==2)
//			((Worm)a).crawl();
//		else if (a.ani==3)
//			((Bird)a).fly();
//		else if (a.ani==4)
//			((Cheetah)a).run();
//		else if (a.ani==5)
//			((Sloth)a).hang();
//		else
//			System.out.println("I'm an Animal, I just move.");
//	}
//	public static void main(String[] Args)
//	{
//		Animal a = new Animal();
//		Crab c = new Crab();
//		Worm w = new Worm();
//		Bird b = new Bird();
//		Cheetah ch = new Cheetah();
//		Sloth s = new Sloth();
//		
//		printAnimalMoving(a);
//		printAnimalMoving(b);
//		printAnimalMoving(c);
//		printAnimalMoving(w);
//		printAnimalMoving(ch);
//		printAnimalMoving(s);
//	}
//}
//		
//
//class Animal {
//	int ani;
//	
//	public Animal (){
//		this.ani =0;
//	
//	}
//	
//}
//	
//
//
//class Crab extends Animal {
//	
//	public Crab (){
//		this.ani=1;
//			
//	}
//	
//	public void scuttle()
//	{	
//		
//		
//		System.out.println("Crabs scuttle.");
//	}
//}
//
//class Worm extends Animal {
//	public Worm (){
//		this.ani=2;
//			
//	}
//	public void crawl()
//	{
//		System.out.println("Worms crawl.");
//	}
//}
//
//class Bird extends Animal {
//	
//	public Bird (){
//		this.ani=3;
//			
//	}
//	public void fly()
//	{
//		System.out.println("Birds fly.");
//	}
//}
//
//class Cheetah extends Animal {
//	
//	public Cheetah (){
//		this.ani=4;
//			
//	}
//	public void run()
//	{
//		System.out.println("Cheetah run.");
//	}
//}
//
//class Sloth extends Animal {
//	
//	public Sloth(){
//		this.ani=5;
//			
//	}
//	public void hang()
//	{
//		System.out.println("Sloths don't move!");
//	}
//}