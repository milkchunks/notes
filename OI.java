package org.tahomarobotics.robot.oi;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
    public final double dampen = 0.4;
    private static final OI INSTANCE = new OI();
    final XboxController driveController = new XboxController(0);

    public static OI getInstance() {
        return INSTANCE;
    }
    public OI initialize() { //when OI is scheduled by the CommandScheduler this will run
        return this;
    }

    public double getLeftInput() {
            if (Math.abs(driveController.getLeftY()) > 15.0/127.0) {
                return driveController.getLeftY() * dampen;
            } else {
                return 0; }
    }
    public double getRightInput() {
        if (Math.abs(driveController.getRightY()) > 15.0/127.0) {
            return driveController.getRightY() * dampen;
        } else {
            return 0;
        }
}
}
//think of the controller joystick as an xy plane