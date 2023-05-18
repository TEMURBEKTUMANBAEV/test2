package class29;
class Vehicle{
    Vehicle(){
        System.out.println("From Vehicle");
    }
}

class Car extends Vehicle{

}

class SportsCar extends Car{
    SportsCar(){
        System.out.println("From SportsCar");
    }
}

public class ConstructorChanning {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
    }
}
