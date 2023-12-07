package org.example;

import org.example.exercise_one.ExerciseOne;
import org.example.exercise_two.ExerciseTwo;

/**
 * Inheritance and polymorphism
 * <p>
 * Exercise 1
 *
 * <p>
 * In this exercise I was asked to create an instrument class:
 * - Subclasses string, wind and percussion
 * - Attributes name and price
 * - Method play() abstract that prints to console "This is sounding an instrument of [subclass]"
 * </p>
 *
 * <p>
 * The loading process only takes place once and I have to demonstrate that the load can be caused
 * by the creation of the first instance of this class or by accessing a static member of it.
 * </p>
 *
 * Exercise 2
 *
 * <p>
 * I have to create a "Car" class:
 * - Attributes brand, model power
 * - brand: static final
 * - model: static
 * - power: final
 * </p>
 *
 * <p>
 * I have to demonstrate the difference between the three types of attributes and find out if any
 * can be initialized in the constructor.
 * </p>
 *
 * <p>
 * Then I have to add two methods:
 * - static brake() that has to print to console "The vehicle is braking"
 * - non-static accelerate() that has to print to console "The vehicle is accelerating"
 * </p>
 *
 * <p>
 * I have to demonstrate how to invoke the static and non-static method from the main class.
 * </p>
 *
 * @author Christian Gálvez Hurtado
 * @version 1.0
 */

public class Main {

    /**
     * From the main class we will start the exercises.
     *
     * @param args Arguments from the command line (not used in this example).
     */
    public static void main(String[] args) {

        /**
         * Call a method from the ExerciseOne class to execute the first exercise.
         */
        ExerciseOne.executeExerciseOne();

        /**
         * Call a method from the ExerciseTwo class to execute the second exercise.
         */
        ExerciseTwo.executeExerciseTwo();
    }
}