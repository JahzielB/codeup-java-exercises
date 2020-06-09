public class DishTest {
    public static void main(String[] args) {
//        Dish dish1 = new Dish();
//        dish1.setCostInCents(4);
//        dish1.setNameOfDish("pizza");
//        dish1.setWouldRecommend(true);
//        dish1.printSummary();

        Dish dish = new Dish(52, "pizza", true);
        dish.printSummary();
        DishTools.analyzeDishCost(dish);
        DishTools.shoutDishName(dish);
        DishTools.flipRecommendation(dish);
    }
}
