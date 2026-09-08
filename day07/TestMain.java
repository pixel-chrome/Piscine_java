public class TestMain{
	public static void main(String[] args){
		Solo<String> strSolo = new Solo<>("toto");
		System.out.println("strSolo = toto");
		String strValue = strSolo.getValue();
		System.out.println(strValue);
		strSolo.setValue("tata");
		System.out.println(strSolo.getValue());

		Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
		Integer intValue = intSolo.getValue();
		intSolo.setValue(Integer.valueOf(1337));

		Pair<String,Integer> dPair = new Pair<>("test",42);
		dPair.display();
	}
}
