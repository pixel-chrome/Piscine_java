package Factory;

public class TestMain{
    public static void main(String[] args){
        Factory factory = new Factory();
        Elf elf = new Elf(factory);

        System.out.println("Pick toy");
        System.out.println(elf.pickToy("teddy")); // on attend true
        System.out.println(elf.pickToy("gameboy")); // on attend false : deja un jouet

        System.out.println("Unknown toy");
        Elf Elf2 = new Elf(factory);
        System.out.println(Elf2.pickToy("car")); // false

        System.out.println("Pick papers");
        System.out.println(elf.pickPapers(2)); // true

        System.out.println("Pack toy");
        GiftPaper paper1 = elf.pack(); // contient le teddy
        System.out.println(paper1 != null); // true
        System.out.println(paper1.unwrap().getTitle()); // teddy

        System.out.println("Pack without toy");
        GiftPaper paper2 = elf.pack(); // papier sans jouet
        System.out.println(paper2 != null); // true
        System.out.println(paper2.unwrap()); // null

        System.out.println("No more papers");
        System.out.println(elf.pack()); 
    }    
}
