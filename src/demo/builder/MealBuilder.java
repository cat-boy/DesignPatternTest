package demo.builder;

/**
 * @Title: MealBuilder
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:12
 * @Version: 1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
