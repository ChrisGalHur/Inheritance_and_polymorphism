package org.example.exercise_one;

/**
 * This class represents a Wind instrument that extends from Instrument
 *
 * @version 1.0 07/12/2021
 * @author Christian Gálvez Hurtado
 */
public class WindInstrument extends Instrument{

    /**
     * Static block
     *
     * This block is executed when the class is loaded only once.
     */
    static {
        System.out.println("Loading Wind class");
    }

    /**
     * Initializing block
     *
     * This block is executed when the class is instantiated.
     */
    {
        System.out.println("Initializing Wind class");
    }

    //Constructors
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    /**
     * Method play
     *
     * This method is implemented from the abstract method play in the Instrument class.
     *
     * @return String A message indicating the type of the instrument.
     */
    @Override
    public String play() {
        return "This is sounding an instrument of Wind: ";
    }
}
