import java.util.ArrayList;

public abstract class SpaceMarine extends Unit{
    private Weapon equippedWeapon;
    private static ArrayList<SpaceMarine> squad = new ArrayList<SpaceMarine>();

    public SpaceMarine(String name, int hp, int ap){
        super(name, hp, ap);
        squad.add(this);
    }

    public Weapon getWeapon(){
        return equippedWeapon;
    }

    @Override
    public boolean equip(Weapon arme){
        boolean isEquipped = false;
        SpaceMarine Marine = null;
        for(int i = 0; i < squad.size(); i++){
            if(squad.get(i).getWeapon() == arme){
                isEquipped = true;
                Marine = squad.get(i);
            }
        }
        if(isEquipped == false){
            this.equippedWeapon = arme;
            System.out.println(getName() + " has been equipped with a " + arme.getName() + ".");
            return true;
        }
        else{
            System.out.println(arme.getName() + " is already equipped by: " + Marine.getName() + ".");
            return false;
        }
    }

    @Override 
    public boolean attack(Fighter personne){
        if(getWeapon() == null){
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }
        else if (getAp() >= equippedWeapon.getApcost()){
            if(getWeapon().isMelee() && getCloseTarget() == personne || getWeapon().isMelee() == false){
                System.out.println(getName() + " attacks " + personne.getName() + " with a " + getWeapon().getName() + ".");
                personne.receiveDamage(getWeapon().getDamage());
                ap = ap - getWeapon().getApcost();
                equippedWeapon.attack();
                return true;
            }
            else{
                return false;
            }
        }
        else if(getWeapon().isMelee() && getCloseTarget() != personne){
            System.out.println(getName() + ": I'm too far away from " + personne.getName() + ".");
            return false;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean moveCloseTo(Fighter guy){
        if(getCloseTarget() != guy && this != guy && getWeapon().isMelee() == false){
			System.out.println(getName() + " is moving closer to " + guy.getName() + ".");
			this.closeTarget = guy;
			return true;
		}
		else{
			return false;
		}
    }

    @Override 
	public void receiveDamage(int damage){
        if(this.hp - damage >= 0){
            this.hp = hp - damage;
        }
        else{
            this.hp = 0;
        }
	}

    @Override 
    public void recoverAP(){
		if(ap + 9 <= 50){
			this.ap = ap + 9;
		}
		else{
			this.ap = 50;
		}
	}
            
}
