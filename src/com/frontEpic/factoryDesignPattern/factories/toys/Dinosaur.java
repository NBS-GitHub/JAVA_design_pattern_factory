package com.frontEpic.factoryDesignPattern.factories.toys;

import com.frontEpic.factoryDesignPattern.interfaces.I_Toy;

public class Dinosaur implements I_Toy {

   @Override
   public void makeSound() {
      System.out.println("Dinosaur: Roarrrrr");
   }
}
