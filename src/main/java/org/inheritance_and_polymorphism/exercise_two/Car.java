package org.inheritance_and_polymorphism.exercise_two;

/**
 * Class that represents a Car entity.
 *
 * @version 1.0 09/12/2023
 * @author Christian Gálvez Hurtado
 */
public class Car {


    /**
     * Brand of the car.
     * It is a final attribute, initialized in the declaration.
     */
    private static final String BRAND = "Ferrari";

    /**
     * Model of the car.
     * It is a static attribute, shared among all instances.
     * It is not necessary to initialize it in the constructor.
     */
    private static String model;

    /**
     * Power of the car.
     * It is a final attribute, initialized in the declaration.
     * It is not necessary to initialize it in the constructor.
     */
    private final int POWER;

    /**
     * Constructor for the Car class.
     *
     * @param model Model of the car (static attribute)
     * @param power Power of the car (final attribute)
     * @param BRAND Brand of the car (final attribute)
     */
    public Car(String BRAND, String model, int power) {
        this.model = model;
        this.POWER = power;
    }

    /**
     * Get the brand of the car.
     *
     * @return String Brand of the car
     */
    public static String getBrand() {
        return BRAND;
    }

    /**
     * Get the model of the car.
     *
     * @return String Model of the car
     */
    public static String getModel() {
        return model;
    }

    /**
     * Get the power of the car.
     *
     * @return int Power of the car
     */
    public int getPower() {
        return POWER;
    }

    /**
     * Set the model of the car.
     *
     * @param model Model of the car
     */
    public static void setModel(String model) {
        Car.model = model;
    }

    /**
     * Method that simulates the brake of the car.
     *
     * @return String String with the information of the brake
     */
    public static String brake() {
        return "The vehicle is braking";
    }

    /**
     * To string method override.
     *
     * @return String String with the information of the car
     */
    @Override
    public String toString() {
        return "brand= " + BRAND + ", model= " + model + ", power= " + POWER + '}';
    }
}
