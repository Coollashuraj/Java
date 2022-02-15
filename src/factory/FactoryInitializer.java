package factory;

public class FactoryInitializer {
	 public static void main(String[] args) {
		 FoodFactory foodFactory = new FoodFactory();
		 Food cake= foodFactory.getFood("CAKE");
		 System.out.println(cake.getName());
		 Food pizza= foodFactory.getFood("PIZZA");
		 System.out.println(pizza.getName());
	 }
	 }

