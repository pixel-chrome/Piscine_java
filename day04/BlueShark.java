public class BlueShark extends Shark{
	public BlueShark(String name){
		super(name);
	}

	@Override
	public boolean canEat(Animal food){
		if(food.getType().equals("fish") && food != this){
			return(true);
		}
		else{
			return(false);
		}
	}
}
