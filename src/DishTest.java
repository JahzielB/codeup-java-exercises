public class DishTest {
    public static void main(String[] args) {

        Dish dish = new Dish();

        dish.costInCents = 350;
        dish.nameOfDish = "Loch Ness Monster";
        dish.wouldRecommend = true;

        dish.printSummary();
    }
}
