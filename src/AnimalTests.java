import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTests {

	@Test
	void DeerTest() {
		Deer deer = new Deer();
		deer.eat(FoodType.PLANTS, 1220);
		assertEquals(true, deer.isSated());
		
	}
	
	@Test
	void BushTest() {
		Bush bush = new Bush();
		bush.eat(FoodType.PLANTS, 40);
		assertEquals(false, bush.isSated());
		
	}
	
	@Test
	void PigTest() {
		Pig pig = new Pig();
		pig.eat(FoodType.MEAT, 200);
		assertEquals(false, pig.isSated());
		
	}
	
	@Test
	void ChimpTest() {
		Chimp chimp = new Chimp();
		chimp.eat(FoodType.MEAT, 1100);
		assertEquals(true, chimp.isSated());
	}
	
	@Test
	void PandaTest() {
		Panda panda = new Panda();
		panda.eat(FoodType.PLANTS, 3000);
		assertNotEquals(true, panda.isSated());
		//^^^ test to verify the 50% loss in calories for the panda
		panda.eat(FoodType.PLANTS, 6000);
		assertEquals(true, panda.isSated());
	}
	
	@Test 
	void WolfTest() {
		Wolf wolf = new Wolf();
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		assertEquals(true, wolf.isSated());
	}

}
