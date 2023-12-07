package org.example.exercise_one;

/**
 * Abstract class Instrument
 *
 * This class is the parent of the classes PercussionInstrument, WindInstrument and StringInstrument
 *
 * @version 1.0 07/12/2023
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

    // Constructors
    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

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
