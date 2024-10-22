package simulatorlib;

public class PIDConfig {
    double Kp;
    double Ki;
    double Kd;
    
    public PIDConfig(double Kp, double Ki, double Kd) {
        this.Kp = Kp;
        this.Ki = Ki;
        this.Kd = Kd;
    }
}
