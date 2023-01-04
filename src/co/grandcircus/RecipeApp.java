package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oop.movielist.Movie;

public class RecipeApp {

	
	public static void main (String[] args) {
		
		
		
		Ingredient ingredient = new Ingredient();
	    ingredient.add("marshmallow", "", 1.0);
	    ingredient.add("chocolate", "oz", 0.5);
	    ingredient.add("Graham cracker", "", 1.0);
	    
	    
//	    List<Movie> movies = new ArrayList<>();
//		movies.add(new Movie("Jurassic Park", "Adventure"));
	    
	    
	    
	    
	    
		Recipe recipe = new Recipe();
		recipe.add("S'more", ingredient);
		
		
	
	}	
	
	

	public static Recipe easiestRecipe(List<Recipe> recipe) {
		
			Recipe qty1 = recipe.ingredient.quantity.get(0);
		for (Recipe qty : recipe ) {
			if (qty1. > qty) {
				
			}
			
		}
		
		return qty1; 
	}
	
	
	
}	
	

