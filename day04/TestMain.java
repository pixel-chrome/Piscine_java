class TestMain{
	public static void main(String[] args){
		Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);

		System.out.println(isidore.getName() + " has " + isidore.getName() + " legs and is a " + isidore.getType() + ".");
	}
}
