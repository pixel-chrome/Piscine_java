public class TestMain{
	public static void main(String[] args){
		Proto john = new Proto("John", 100, 20);
		Proto mart = new Proto("Mart",70,30);
		Proto gay = new Proto("Gay", 25, 100);
		

		System.out.println("John hp(100): " + john.getHp() + " ap(20): " + john.getAp());
		PlasmaRifle gun = new PlasmaRifle();
		PowerFist fist = new PowerFist();
	
		System.out.println("gun damage(21): " + gun.getDamage() + " apcost(5): " + gun.getApcost());

		john.equip(gun);
		mart.equip(fist);

		

	}
}
