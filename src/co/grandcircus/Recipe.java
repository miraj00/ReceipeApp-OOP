package co.grandcircus;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private String title;
	private List<Ingredient> ingredients;
	private String instructions;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	public Recipe() {
		super();
	}
	public Recipe(String title) {
		super();
		this.title = title;
		this.ingredients = new ArrayList<>();
		this.instructions = "N/A";
	}
	
}
