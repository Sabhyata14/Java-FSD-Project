package com.simplilearn.semi.looselycoupled;

public class FoodApplication {

    private FoodService foodService = null;

    FoodApplication(FoodService foodService){
        this.foodService = foodService;
    }

    //order Food
    public void orderFood(String message, String customer) {

        //logic
        this.foodService.serverFood(message, customer);
    }

}
