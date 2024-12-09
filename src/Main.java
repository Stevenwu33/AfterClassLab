import Interface.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1:
       Parent parent = new Child();
       Child child = (Child) parent;

       //Task 2:
       Animal cat = new Cat();
       Animal dog = new Dog();
       cat.animalSound();
       dog.animalSound();

       //Task 3:
        System.out.println(cat instanceof Animal);
        System.out.println(dog instanceof Animal);

        //Task 4:
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.getArea();
        circle.getPerimeter();
        rectangle.getArea();
        rectangle.getPerimeter();

        //Task 5:
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle bike = new Bike();
        bike.stop();
        bike.start();











        
    }
}