package com.frontEpic.factoryDesignPattern.main;

import com.frontEpic.factoryDesignPattern.factories.ToyFactory;
import com.frontEpic.factoryDesignPattern.interfaces.I_Toy;

public class Main {
   public static void main(String[] args) {

      // Create factory
      ToyFactory toyFactory = null;

      // Make toys
      I_Toy doll1 =  toyFactory.makeToy("Doll");
      doll1.makeSound();

      I_Toy car1 = toyFactory.makeToy("car");
      car1.makeSound();

      I_Toy dinosaur1 = toyFactory.makeToy("Dinosaur");
      dinosaur1.makeSound();

      I_Toy experimental1 = toyFactory.makeToy("airplane");
      experimental1.makeSound();

   }
}
