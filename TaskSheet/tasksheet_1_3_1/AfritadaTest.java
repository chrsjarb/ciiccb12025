package TaskSheet.tasksheet_1_3_1;

import java.util.Arrays;

// Base class: Afritada
class Afritada {

    public String[] getIngredients() {
        return new String[]{"Tomato Sauce", "Meat", "Potatoes & Carrots"}; 
    }

    public void showIngredients() {
        System.out.println("Afritada = " + Arrays.toString(getIngredients()) + " 🍲\n");
    }
}

// Mechado extends Afritada
class Mechado extends Afritada {

    @Override 
    public String[] getIngredients() {
        return new String[]{
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste"
        };
    }

    @Override 
    public void showIngredients() {
        System.out.println("Mechado = " + Arrays.toString(getIngredients()) + " 🍲\n");
    }
}

// Menudo extends Mechado
class Menudo extends Mechado {

    @Override 
    public String[] getIngredients() {
        return new String[]{
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Liver Spread", 
            "Hotdog"
        };
    }

    @Override 
    public void showIngredients() {
        System.out.println("Menudo = " + Arrays.toString(getIngredients()) + " 🍲\n");
    }
}

// Caldereta extends Afritada
class Caldereta extends Afritada {

    @Override 
    public String[] getIngredients() {
        return new String[]{
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Raisins", 
            "Hotdog",  
            "Cheese"
        };
    }

    @Override 
    public void showIngredients() {
        System.out.println("Caldereta = " + Arrays.toString(getIngredients()) + " 🍲\n");
    }
}

// Only one public class — with the main() method
public class AfritadaTest {
    public static void main(String[] args) {
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado(); 
        Afritada meal3 = new Menudo();  
        Afritada meal4 = new Caldereta(); 

        System.out.println("--- Meal Ingredients ---");
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
