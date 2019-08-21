package com.frontEpic.factoryDesignPattern.factories;

import com.frontEpic.factoryDesignPattern.factories.toys.*;
import com.frontEpic.factoryDesignPattern.interfaces.I_Toy;

public class ToyFactory {

   I_Toy toy;

   public I_Toy makeToy(String kind){

      if(kind.toLowerCase().equals("doll"))
         toy = new Doll();
      else if(kind.toLowerCase().equals("car"))
         toy = new Car();
      else if(kind.toLowerCase().equals("dinosaur"))
         toy = new Dinosaur();
      else
         toy = new Experimental();

      return toy;
   }

}
