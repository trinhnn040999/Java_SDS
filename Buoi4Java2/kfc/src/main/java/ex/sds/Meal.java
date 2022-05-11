package ex.sds;

import java.util.List;

import ex.sds.food.OrderItem;
import ex.sds.food.OrderSpec;
import ex.sds.food.combo.Combos;

public class Meal {
    private List<OrderItem> orderItems;
    public static Meal buildMeal(String mealName) {
        
        if (mealName.equals("TwoPersonLunch")) {
            // TODO: gọi hàm 
            Meal lunch = new Meal();//chua co constructor, cam cung cap cpmstructor de khoi tao
            List<OrderSpec> orderSpecs = Combos.TwoPersonLunch();
            for(OrderSpec os: orderSpecs){
                //tao OrderItem tuong ung voi OrderSpec os. Save
                //OrderItem vua tao vao lunch.orderIteam
            }
            return lunch;
        }
        else if(mealName.equals("FourPersonLunch")) {
            // TODO: tuong tu nhu nhanh tren
            //Please remember to return the newly created meal
        }
        return null;
    }
    public void printMeal() {
        // TODO:
    }
}
