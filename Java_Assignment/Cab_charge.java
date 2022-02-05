class Cab{
    int reser_charge=20;
    int distance;
    Cab(){
        System.out.println("Your reservation charge is : "+reser_charge+" RS.");
    }
    public void Cab_charge(int dist){
     this.distance=dist;
     if (distance<=0){
         System.out.println("You should pay atleast reservation charge "+reser_charge+" RS.");
     }
     else {
         int charge=(distance*12)+reser_charge;
         System.out.println("Your overall distance is "+distance+"Km and your bill with reservation charge is "+charge+" RS.");
     }
    }
}

public class Cab_charge {
    public static void main(String[] args) {
        Cab b=new Cab();
        b.Cab_charge(0);
    }
}
