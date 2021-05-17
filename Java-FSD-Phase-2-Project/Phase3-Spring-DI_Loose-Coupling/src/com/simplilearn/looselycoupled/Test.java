package com.simplilearn.looselycoupled;

public class Test {
    public static void main(String[] args) {

        FoodApplication customer1 = new FoodApplication(new BurgerService());
        customer1.orderFood("Happy to serve !", "John Smith");

        FoodApplication customer2 = new FoodApplication(new PizzaService());
        customer2.orderFood("thrilled tto serve !", "Marry Smith");

        FoodApplication customer3 = new FoodApplication(new NoodlesService());
        customer3.orderFood("delighted to serve !", "Venkat Smith");
    }
}
