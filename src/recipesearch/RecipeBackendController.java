package recipesearch;

import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.*;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RecipeBackendController  {

    RecipeDatabase db = RecipeDatabase.getSharedInstance();
    public String cuisine;
    public String mainIngredient;
    public String difficulty;
    public int maxTime;
    public int maxPrice;

    public List<String> cuisineList = Arrays.asList("Sverige", "Grekland", "Indien", "Asien", "Afrika", "Frankrike");
    public List<String> mainIngredientList = Arrays.asList("Kött", "Fisk", "Kyckling", "Vegetarisk");
    public List<String> difficultyList = Arrays.asList("Lätt", "Mellan", "Svår");
    public List<Integer> maxTimeList = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150);



    public List<Recipe> getRecipes() {

        return db.search(new SearchFilter(difficulty, maxTime, cuisine, maxPrice, mainIngredient));

    }

    public void setCuisine(String cuisine) {
        if (cuisineList.contains(cuisine)){
            this.cuisine = cuisine;
        } else {
            this.cuisine = null;
        }
    }

    public void setMainIngredient(String mainIngredient) {
        if (mainIngredientList.contains(mainIngredient)){
            this.mainIngredient = mainIngredient;
        } else {
            this.mainIngredient = null;
        }
    }

    public void setDifficulty(String difficulty){
        if (difficultyList.contains(difficulty)){
            this.difficulty = difficulty;
        } else {
            this.difficulty = null;
        }

    }
    public void setMaxPrice(int maxPrice){
        if (maxPrice > 0){
            this.maxPrice = maxPrice;
        } else {
            this.maxPrice = 0;
        }
    }

    public void setMaxTime(int maxTime){
        if (maxTimeList.contains(maxTime)){
            this.maxTime = maxTime;
        } else {
            this.maxTime = 0;
        }


    }
}










/*
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;

        switch (cuisine){
            case "Sverige":
                setCuisine("Sverige");
                break;
            case "Grekland":
                setCuisine("Grekland");
                break;
            case "Indien":
                setCuisine("Indien");
                break;
            case "Asien":
                setCuisine("Asien");
                break;
            case "Afrika":
                setCuisine("Afrika");
                break;
            case "Frankrike":
                setCuisine("Frankrike");
                break;

            default:setCuisine(null);
                break;

        }

    }

    public void setMainIngredient(String mainIngredient) {
        switch (mainIngredient){
            case "Kött":
                setMainIngredient("Kött");
                break;
            case "Fisk":
                setMainIngredient("Fisk");
                break;
            case "Kyckling":
                setMainIngredient("Kyckling");
                break;
            case "Vegetariskt":
                setMainIngredient("Vegetariskt");
                break;

            default:setMainIngredient(null);
                break;

        }
        this.mainIngredientVar = mainIngredient;
    }

    public void setDifficulty(String difficulty){
        switch (difficulty){
            case "Lätt":
                setDifficulty("Lätt");
                break;
            case "Mellan":
                setDifficulty("Mellan");
                break;
            case "Svårt":
                setDifficulty("Svårt");
                break;

            default:setDifficulty(null);
                break;

        }

    }
    public void setMaxPrice(int maxPrice){
        if (maxPrice > 0){
            setMaxPrice(maxPrice);
        }

    }
    public void setMaxTime(int maxTime){

        switch (maxTime){
            case 10:
                setMaxTime(10);
                break;
            case 20:
                setMaxTime(20);
                break;
            case 30:
                setMaxTime(30);
                break;
            case 40:
                setMaxTime(40);
                break;
            case 50:
                setMaxTime(50);
                break;
            case 60:
                setMaxTime(60);
                break;
            case 70:
                setMaxTime(70);
                break;
            case 80:
                setMaxTime(80);
                break;
            case 90:
                setMaxTime(90);
                break;
            case 100:
                setMaxTime(100);
                break;
            case 110:
                setMaxTime(110);
                break;
            case 120:
                setMaxTime(120);
                break;
            case 130:
                setMaxTime(130);
                break;
            case 140:
                setMaxTime(140);
                break;
            case 150:
                setMaxTime(150);
                break;
        }

    }*/
