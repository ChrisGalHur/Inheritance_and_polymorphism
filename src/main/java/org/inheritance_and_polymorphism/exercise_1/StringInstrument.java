package org.inheritance_and_polymorphism.exercise_1;

/**
 * This class represents a String instrument that extends from Instrument
 *
 * @version 1.0 09/12/2021
 * @author Christian Gálvez Hurtado
 */
public class StringInstrument extends Instrument{

    /**
     * Static block
     *
     * This block is executed when the class is loaded only once.
     * Prints a message to the console indicating that the StringInstrument class is being loaded.
     */
    static {
        System.out.println("Loading String class");
    }

    /**
     * Initializing block
     *
     * This block is executed when the class is instantiated.
     * Prints a message to the console indicating that the StringInstrument class is being initialized.
     */
    {
        System.out.println("Initializing String class");
    }

    /**
     * Constructor class StringInstrument
     *
     * @param name Name of the StringInstrument
     * @param price Price of the StringInstrument
     */
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    //Methods
    /**
     * Method play
     *
     * This method is implemented from the abstract method play in the Instrument class.
     *
     * @return String A message indicating the type of the instrument.
     */
    @Override
    public String play() {
        return "This is sounding an instrument of String: ";
    }
}
