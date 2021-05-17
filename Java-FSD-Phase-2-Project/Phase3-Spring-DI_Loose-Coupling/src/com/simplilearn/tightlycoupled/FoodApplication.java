package com.simplilearn.tightlycoupled;

public class FoodApplication {

    // this leads to hard-coded dependency
    private static BurgerService foodservice = new BurgerService();
    //order Food
    public static void orderFood(String message, String customer) {

        //logic
        foodservice.serverFood(message, customer);
    }

    public static void main(String[] args) {

        orderFood("We serve only burger. ", "John Smith");
    }
}
