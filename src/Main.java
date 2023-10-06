public class Main {
    public static void main(String[] args) {
        car Sedan= new car("Toyota", "Corolla", 230, 0);


        System.out.println("The speed is "+Sedan.Speed);
        Sedan.accelerate();
        Sedan.accelerate();
        Sedan.select();
        Sedan.honk();

    }
}