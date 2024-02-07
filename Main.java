// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import com.sun.source.util.SourcePositions;

import java.lang.reflect.Array;

public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
	
	Labrador labDog = new Labrador("Stella","brown");
        System.out.println(labDog.getName() + " says " + labDog.bark());
    labDog.waddle();//doesn't og work bc waddle was only in york had to add it to lab

    Yorkshire yorkDog = new Yorkshire("Yorkie",2);
        System.out.println(yorkDog.getName() + " says " + yorkDog.bark());
     yorkDog.waddle();

     //part 1 dont
//-------------------------------------------------------------------------------------------
        












    }
}
