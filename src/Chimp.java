
public class Chimp implements Animal{
int currentCalories=0;
	@Override
	public void eat(FoodType food, int calories) {
		this.currentCalories=calories;
		
	}

	@Override
	public boolean isSated() {
		if(currentCalories >= 1000) {
			return true;
		}
		return false;
	}

}
