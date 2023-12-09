package org.inheritance_and_polymorphism.exercise_one;

/**
 * This class represents the first exercise of the first practice of the subject Inheritance and Polymorphism in Java.
 *
 * @version 1.0 09/12/2021
 * @author Christian Gálvez Hurtado
 */
public class ExerciseOne {

    /**
     * This method is only used to execute the exercise one.
     * <p>
     * It creates objects of the classes WindInstrument, StringInstrument and PercussionInstrument and calls their methods.<br>
     * I demonstrate when you initialize an object of a subclass, the parent class is first loaded and initialized by using static and initializing blocks.
     *
     */
    public static void executeExerciseOne(){

        //Creating objects
        WindInstrument windInstrument1 = new WindInstrument("flute", 100);
        WindInstrument windInstrument2 = new WindInstrument("trumpet", 200);
        StringInstrument stringInstrument1 = new StringInstrument("violin", 300);
        PercussionInstrument percussionInstrument1 = new PercussionInstrument("drum", 400);
        StringInstrument stringInstrument2 = new StringInstrument("guitar", 500);

        //Calling methods
        System.out.println(windInstrument1.play() + windInstrument1.getName());
        System.out.println(stringInstrument1.play() + windInstrument2.getName());
        System.out.println(percussionInstrument1.play() + percussionInstrument1.getName());
        System.out.println(stringInstrument2.play() + stringInstrument2.getName());
    }
}
