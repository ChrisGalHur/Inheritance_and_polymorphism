package org.inheritance_and_polymorphism.exercise_1;

/**
 * This class represents the first exercise of the first practice of the subject Inheritance and Polymorphism in Java.
 *
 * @version 1.0 09/12/2023
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
    public static void execute(){

        System.out.println("\n ---EXERCISE ONE---\n");

        /*
        Creating objects
        I create objects of the classes WindInstrument, StringInstrument and PercussionInstrument.
        I print the objects to the console, and we can see that the static and initializing blocks are executed before the constructor.
         */
        WindInstrument windInstrument1 = new WindInstrument("flute", 100);
        WindInstrument windInstrument2 = new WindInstrument("trumpet", 200);
        StringInstrument stringInstrument1 = new StringInstrument("violin", 300);
        PercussionInstrument percussionInstrument1 = new PercussionInstrument("drum", 400);
        StringInstrument stringInstrument2 = new StringInstrument("guitar", 500);

        /*
        Calling methods
        I call the method play of each object.
        */
        System.out.println(windInstrument1.play() + windInstrument1.getName());
        System.out.println(stringInstrument1.play() + windInstrument2.getName());
        System.out.println(percussionInstrument1.play() + percussionInstrument1.getName());
        System.out.println(stringInstrument2.play() + stringInstrument2.getName());
    }
}
