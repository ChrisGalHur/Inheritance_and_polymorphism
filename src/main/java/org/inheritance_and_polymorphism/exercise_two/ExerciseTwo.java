package org.inheritance_and_polymorphism.exercise_two;

/**
 * This class represents the second exercise of the first practice of the subject Inheritance and Polymorphism in Java.
 *
 * @version 1.0 09/12/2023
 * @author Christian Gálvez Hurtado
 */
public class ExerciseTwo {

    /**
     * This method is only used to execute the exercise two.
     * <p>
     * It creates objects of the class Car and calls their methods.
     * I demonstrate the difference of types of attributes and how to invoke the static and non-static methods.
     */
    public static void executeExerciseTwo(){

        System.out.println("\n ---EXERCISE TWO---\n");

        /*
        Creating objects
        Two Car objects are created, one with the same brand as the static final attribute and another with a different brand.
        The console shows that the brand of the first one is the same as the static final attribute.
         */
        Car car1 = new Car("Ferrari", "Panda", 105);
        System.out.println(car1.toString());
        Car car2 = new Car("Fiat", "Pedro", 200);
        System.out.println(car2.toString());

        /*
        I print the static attribute to the console, and we can see that it is the same as the static final attribute.
         */
        System.out.println("\nNow in the dealership there are.");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        /*
        Calling methods
        I call the static method brake() and the non-static method brake() of the class Car.
        We can see that the static method is called by the class, and the non-static method is called by the object.
         */
        System.out.println(Car.brake());
        System.out.println("The class has braked.\n"
                + "");
        System.out.println(car2.brake());
        System.out.println("The car " + car2.toString() + " has braked.\n"
                + "");
    }
}
