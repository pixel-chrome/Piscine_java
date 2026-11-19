import java.util.List;

public class HamSandwich extends Sandwich{
    public HamSandwich(){
        super(4.00f,230);
        this.vegetarian = false;
        ingredients.addAll(List.of("tomato",
                            "salad",
                            "cheese",
                            "ham",
                            "butter"));
    }
}
