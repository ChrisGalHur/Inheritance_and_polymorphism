package org.inheritance_and_polymorphism;

import org.inheritance_and_polymorphism.exercise_1.ExerciseOne;
import org.inheritance_and_polymorphism.exercise_2.ExerciseTwo;

/**
 * This class is used to execute the exercises of the unit: Inheritance and polymorphism<br>
 * <p>
 * Exercise 1<br>
 * Demonstration of static and initialization blocks.<br>
 * <p>
 * Exercise 2<br>
 * Demonstration of static, final and static final attributes and static and non-static methods.<br>
 * <p>
 * @see org.inheritance_and_polymorphism.exercise_1.ExerciseOne
 * @see org.inheritance_and_polymorphism.exercise_2.ExerciseTwo
 * @author Christian Gálvez Hurtado
 * @version 2.0 09/12/2023
 */

public class Main {

    /**
     * From the main class we will start the exercises.
     *
     * @param args Arguments from the command line (not used in this example).
     */
    public static void main(String[] args) {

        executeExerciseOne();
        executeExerciseTwo();
    }

    /**
     * Call a method from the ExerciseOne class to execute the first exercise.
     * <p>
     * In this exercise I was asked to create an instrument class:<br>
     * - Subclasses string, wind and percussion<br>
     * - Attributes name and price<br>
     * - Method play() abstract that prints to console "This is sounding an instrument of [subclass]"*
     * <p>
     * The loading process only takes place once and I have to demonstrate that the load can be caused
     * by the creation of the first instance of this class or by accessing a static member of it.
     * @see org.inheritance_and_polymorphism.exercise_1.ExerciseOne
     */
    public static void executeExerciseOne() {
        ExerciseOne.execute();
    }

    /**
     * Call a method from the ExerciseTwo class to execute the second exercise.
     * <p>
     * I have to create a "Car" class:<br>
     * - Attributes brand, model power<br>
     * - brand: static final<br>
     * - model: static<br>
     * - power: final<br>
     * <p>
     * I have to demonstrate the difference between the three types of attributes and find out if any
     * can be initialized in the constructor.
     * <p>
     * Then I have to add two methods:<br>
     * - static brake() that has to print to console "The vehicle is braking"<br>
     * - non-static accelerate() that has to print to console "The vehicle is accelerating"
     * <p>
     * I have to demonstrate how to invoke the static and non-static method from the main class.
     * @see org.inheritance_and_polymorphism.exercise_2.ExerciseTwo
     */
    public static void executeExerciseTwo() {
        ExerciseTwo.execute();
    }
}