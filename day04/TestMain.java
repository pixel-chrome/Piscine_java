class TestMain{
	public static void main(String[] args){
		Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);
		Animal lion = new Animal("Leo", 4, Animal.Type.MAMMAL);
		
		Animal piaf = new Animal("Edit", 2, Animal.Type.BIRD);
		Animal poisson = new Animal("Nemo", 4, Animal.Type.FISH);

		System.out.println(isidore.getName() + " has " + isidore.getName() + " legs and is a " + isidore.getType() + ".");

		System.out.println("nb of Animals(4): " + isidore.getNumberOfAnimals());
		System.out.println("nb of mammals(2): " + lion.getNumberOfMammals());
		System.out.println("nb of fish(1): " + poisson.getNumberOfFish());
		System.out.println("nb of bird(1): " + piaf.getNumberOfBirds());

	}
}
