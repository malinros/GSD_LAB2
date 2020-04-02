
package recipesearch;

import java.awt.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;


public class RecipeSearchController implements Initializable {

    RecipeDatabase db = RecipeDatabase.getSharedInstance();
    RecipeBackendController backend = new RecipeBackendController();

    @FXML private FlowPane hitListFlowPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateRecipeList();

    }

    private void updateRecipeList(){
        hitListFlowPane.getChildren().clear();
        List <Recipe> allrecipes = backend.getRecipes();

        for (Recipe recipe : allrecipes){
            hitListFlowPane.getChildren().add(new recipeListItem(recipe,this));
        }

    }

}