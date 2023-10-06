public class car {
    String Brand;
    String Model;
    int Speed;
    int Gear;


    public car(String Brand, String Model, int Speed , int Gear){
        this.Brand=Brand;
        this. Model=Model;
        this. Speed= Speed;
        this.Gear= Gear;
    }
    void  accelerate(){
     Speed=Speed +20;
     System.out.println(" accelerate, Speed is " +Speed);
    }
    void honk (){
        System.out.println("pim pim");
    }
    void select(){
        Gear= Gear +1;
        System.out.println("number of gear is"  + Gear);
    }
}
