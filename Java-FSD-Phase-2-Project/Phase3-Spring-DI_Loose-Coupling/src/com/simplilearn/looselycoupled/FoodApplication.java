package com.simplilearn.looselycoupled;

public class FoodApplication {

    private FoodService foodService;

    // dependency Injection
    FoodApplication(FoodService foodService){
        this.foodService = foodService;
    }

    //order Food
    public void orderFood(String message, String customer) {
        this.foodService.serveFood(message, customer);
    }

}
