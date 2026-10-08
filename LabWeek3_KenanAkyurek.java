package labweek3_kenanakyurek;


public class LabWeek3_KenanAkyurek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car = new Car("38 ABC 123", "Toyota Corolla", 20.0, 50.0);

        car.checkStatus();

        car.drive(120);
        car.checkStatus();

        car.drive(150);
        car.checkStatus();

        car.drive(100);
        car.checkStatus();

        car.refuel(20);
        car.checkStatus();

        car.refuel(40);
        car.checkStatus();

        car.drive(470);
        car.checkStatus();
    }
    
}
