import simulatorlib.Simulator;

public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        YourAuto auto = new YourAuto(); // Replace YourAuto with your auto class
        auto.runOpMode();
    }
}
