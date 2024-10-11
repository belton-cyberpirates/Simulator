To use the FTC Simulator Library:
  1. Create a main class with the main java method, do the following steps within this method
  2. Create an instance of the Simulator class (simulatorlib.Simulator)
  3. Create an instance of your auto class
  4. Call the runOpMode method on your auto class

**Example Main class:**

import simulatorlib.Simulator;

public static class Main {
  public static void main(String[] args) {
    Simulator simulator = new Simulator();
    AutoBlueLeft auto = new AutoBlueLeft();
    auto.runOpMode();
  }
}
