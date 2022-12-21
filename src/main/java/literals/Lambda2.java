package literals;

public class Lambda2 {
    public static void main(String[] args) {
        //Lambda expression can only be used for slowDown method which is the only abstract method
        MyInterface myInterface = () -> "Slow down extended from Vehicle by My Interface";
        System.out.println(myInterface.slowDown());
        System.out.println(myInterface.turnAlarmOn());
        System.out.println(Vehicle.turnAlarmOff());

    }
}
    interface MyInterface extends Vehicle {
        @Override
        default String turnAlarmOn() {
            return Vehicle.super.turnAlarmOn();
        }
    }
    @FunctionalInterface
    interface Vehicle { //having one abstract method, one static method, one default method
        String slowDown();
        default String turnAlarmOn() {
            return "Turning the vehicle alarm on.";
        }
        static String turnAlarmOff() {
            return "Turning the vehicle alarm off.";
        }
    }

