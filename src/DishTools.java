public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName (Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("Less expensive than average");
        } else if (dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish) {
        dish.setWouldRecommend(!dish.isWouldRecommend());
    }

}
