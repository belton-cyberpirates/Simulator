public class PIDController {
    double Kp;
    double Ki;
    double Kd;

    double IntegralSum = 0
    double lastError = 0

    public PIDController(double Kp, double Ki, double Kd) {
        this.Kp = Kp;
        this.Ki = Ki;
        this.Kd = Kd;
    }

    public PIDController(PIDConfig config) {
        this.Kp = config.Kp;
        this.Ki = config.Ki;
        this.Kd = config.Kd;
    }

    public double PIDControl(double reference, double state, double delta) {
        double error = reference - state;
        this.integralSum += error * delta;
        double derivative = (error - lastError) / delta;
        this.lastError = error;

        double output = (error * this.Kp) + (derivative * this.Kd) + (this.integralSum * this.Ki);
        return output;
    }
}
