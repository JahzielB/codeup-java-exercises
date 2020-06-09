public class Dish {

    private int costInCents;
    public int getCostInCents () {
        return this.costInCents;
    }
    public void setCostInCents (int cost) {
        this.costInCents = cost;
    }

    private String nameOfDish;
    public String getNameOfDish () {
        return this.nameOfDish;
    }
    public void setNameOfDish (String name) {
        this.nameOfDish = name;
    }

    private boolean wouldRecommend;
    public boolean isWouldRecommend () {
        return this.wouldRecommend;
    }
    public void setWouldRecommend (boolean recommend) {
        this.wouldRecommend = recommend;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary () {
        System.out.printf("Cost: %d\nName: %s\nRecommended: %b", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }

}
