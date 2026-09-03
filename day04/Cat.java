public class Cat extends Animal{
	private String color = "grey";

	public class Cat(String name){
		super(name, 4, Type.MAMMAL);
		System.out.println(name + ": MEEEOOWWWW");
	}
	public class Cat(String name, String color){
		super(name, 4, Type.MAMMAL);
		this.color = color;
		System.out.println(name + ": MEEEOOWWWW");
	}

	public class void meow(){
		System.out.println(name + " the " + color + " kitty is meowing.");
	}
