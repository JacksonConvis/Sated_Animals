
public class Bush {
	int currentCalories=0;
	
	public void eat(FoodType food, int calories) {
		if(food.equals(FoodType.LIGHT)) {
			this.currentCalories = calories;
		}
		
	}
	
public boolean isSated() {
		
		if(currentCalories >= 50) {
			return true;
		}
		return false;
	}

}
