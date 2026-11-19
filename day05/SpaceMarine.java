import java.util.ArrayList;

public abstract class SpaceMarine extends Unit {
    private Weapon equippedWeapon;
    private static ArrayList<SpaceMarine> squad = new ArrayList<SpaceMarine>();

    public SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
        squad.add(this);
    }

    public Weapon getWeapon() {
        return equippedWeapon;
    }

    @Override
    public boolean equip(Weapon arme) {
        if (arme != null && arme.isEquipped() == false) {
            this.equippedWeapon = arme;
            arme.setEquipped(true);
            System.out.println(getName() + " has been equipped with a " + arme.getName() + ".");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean attack(Fighter personne) {
        if (getWeapon() == null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }
        if (getWeapon().isMelee() && getCloseTarget() != personne) {
            System.out.println(getName() + ": I'm too far away from " + personne.getName() + ".");
            return false;
        }
        if (getAp() < getWeapon().getApcost()) {
            return false;
        }

        System.out.println(getName() + " attacks " + personne.getName() + " with a " + getWeapon().getName() + ".");
        personne.receiveDamage(getWeapon().getDamage());
        ap = ap - getWeapon().getApcost();
        equippedWeapon.attack();
        return true;
    }

    @Override
    public boolean moveCloseTo(Fighter guy) {
        if (getWeapon() != null && getWeapon().isMelee() && getCloseTarget() != guy && this != guy) {
            System.out.println(getName() + " is moving closer to " + guy.getName() + ".");
            this.closeTarget = guy;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void receiveDamage(int damage) {
        if (this.hp - damage >= 0) {
            this.hp = hp - damage;
        } else {
            this.hp = 0;
        }
    }

    @Override
    public void recoverAP() {
        if (ap + 9 <= 50) {
            this.ap = ap + 9;
        } else {
            this.ap = 50;
        }
    }

}
