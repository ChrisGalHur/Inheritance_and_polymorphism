package org.inheritance_and_polymorphism.exercise_one;

/**
 * Abstract class Instrument
 *
 * This class is the parent of the classes PercussionInstrument, WindInstrument and StringInstrument
 *
 * @version 1.0 09/12/2023
 * @author Christian Gálvez Hurtado
 */
public abstract class Instrument {

    /**
     * Static block
     *
     * This block is executed when the class is loaded only once.
     * Prints a message to the console indicating that the Instrument class is being loaded.
     */
    static {
        System.out.println("Loading Instrument class");
    }

    // Attributes
    private String name;

    private double price;

    /**
     * Constructor class Instrument
     *
     * @param name Name of the instrument
     * @param price Price of the instrument
     */
    protected Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Get the name of the instrument
     *
     * @return String Name of the instrument
     */
    public String getName() {
        return name;
    }

    /**
     * Get the price of the instrument
     *
     * @return double Price of the instrument
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the name of the instrument
     *
     * @param name Name of the instrument
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the price of the instrument
     *
     * @param price Price of the instrument
     */
    public void setPrice(double price) {
        this.price = price;
    }

    // Methods
    /**
     * Abstract method play
     *
     * This method is implemented in the subclasses PercussionInstrument, WindInstrument and StringInstrument.
     *
     * @return String A message indicating the type of the instrument.
     */
    public abstract String play();
}
