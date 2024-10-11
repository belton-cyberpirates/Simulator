import simulatorlib.Simulator;

public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        AutoBlueLeft auto = new AutoBlueLeft(); // Replace AutoBlueLeft with your auto class
        auto.runOpMode();
    }
}
