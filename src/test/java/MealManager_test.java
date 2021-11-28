import UseCases.managers.MealsManager;
import org.junit.Before;
import org.junit.Test;


public class MealManager_test {

        MealsManager mealManager;

        @Before
        public void initializeManager() {
            mealManager = new MealsManager();
        }

        @Test
        public void testMeals() {
            // Checking if no meals are available. This should always be vacously true
            assert(mealManager.checkForMeal("No Entites.Meal") == true);
            // Testing that the system is correctly adding meals and storing it in the system
            mealManager.addMeal("Veg Sushi",10,11.11,true);
            assert(mealManager.checkForMeal("Veg Sushi") == true);
            // Testing that the system correctly identifies that certain meals are not present in the system
            assert(mealManager.checkForMeal("Pizza") == false);

        }


}
