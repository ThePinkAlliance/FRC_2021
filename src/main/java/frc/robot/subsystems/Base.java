package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;

public class Base extends SubsystemBase {
  /** Creates a new Motors. */
  WPI_TalonFX talonOne = new WPI_TalonFX(Constants.talonOneCANID);
  WPI_TalonFX talonTwo = new WPI_TalonFX(Constants.talonTwoCANID);
  WPI_TalonFX talonThree = new WPI_TalonFX(Constants.talonThreeCANID);
  WPI_TalonFX talonFour = new WPI_TalonFX(Constants.talonFourCANID);

  public Base() {
  }


  public void tankDriveByJoystick(double speedL, double speedR) {
    talonOne.set(speedL);
    talonTwo.set(speedL);
    talonThree.set(speedR);
    talonFour.set(speedR);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}