package recipesearch;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import se.chalmers.ait.dat215.lab2.*;

import java.awt.*;
import java.io.IOException;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class recipeListItem extends AnchorPane {

    private RecipeSearchController parentController;
    private Recipe recipe;

    @FXML private Label recipeText;
    @FXML private ImageView recipeImage;

    public recipeListItem(Recipe recipe, RecipeSearchController recipeSearchController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("recipe_listitem.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        this.recipe = recipe;
        this.parentController = recipeSearchController;

        recipeImage.setImage(recipe.getFXImage());
        recipeText.setText(recipe.getName());

    }
}
