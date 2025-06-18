package com.lld.LowLevelDesign.SOLID;


import java.util.ArrayList;
import java.util.List;

/*If class B is a Subtype of Class A then we should be able to
  replace object of A with B without breaking the behaviour of the program
  -     Subclass should extend the capability of parent class not narrow it down.

  if we substitute the child the parent object or child object, the logic should not break
  example : Car and MotarCycle
 */
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<Bike> vehicles = new ArrayList<>();
        vehicles.add(new MotarCycle());
        vehicles.add(new Car());

        /*
        the below line will throw null pointer exception
         */
        vehicles.add(new Cycle());

        for(Bike bike: vehicles){
            System.out.println(bike.turnOnEngine().toString());
        }
    }
}

interface Bike{
    Boolean turnOnEngine();
    void accelerate();
}

class MotarCycle implements Bike{
    boolean isEngine;
    int speed;

    @Override
    public Boolean turnOnEngine() {
        return   isEngine = true;
    }

    @Override
    public void accelerate() {
    speed = speed + 10;
    }
}

class Car implements Bike{
    boolean isEngine;
    int speed;

    @Override
    public Boolean turnOnEngine() {
       return isEngine = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}


//Below class is narrowing the capability of Bike - It doesn't follow Liskov principle
class Cycle implements Bike{

    @Override
    public Boolean turnOnEngine() {
        throw new AssertionError("No Engine");
    }

    @Override
    public void accelerate() {

    }
}
