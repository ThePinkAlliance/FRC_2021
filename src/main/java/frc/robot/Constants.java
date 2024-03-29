package frc.robot;

public final class Constants {
    public static double baseMotorGain = 1; 
    public static double shooterTurretMotorGain = 1;
    public static double collectorMotorGain = 1;
    public static double shooterkP = 0.1;
    public static double shooterkI = 0;
    public static double shooterkD = 0;
    public static double shooterCloseVelocity = 300;
    public static double shooterFarVelocity = 400;
    public static double shooterCloseVoltage = 0.7;
    public static double shooterFarVoltage = 0.7;
    public static double conveyorSpeed = 0.5;
    public static double collectorCollectSpeed = 0.8;
    public static boolean collectorExtended = true;
    public static boolean collectorRetracted = false;
    public static double turretSpeed = 1;
    public static boolean turretLeft = true;
    public static boolean turretRight = false;

    // Lights Pattern Options
    public static double lightsColor1BlendtoBlack = -0.03;
    public static double lightsColor1LarsonScanner = -0.01;
    public static double lightsColor1LightChase = 0.01;
    public static double lightsColor1HeartbeatSlow = 0.03;
    public static double lightsColor1HeartbeatMedium = 0.05;
    public static double lightsColor1HeartbeatFast = 0.07;
    public static double lightsColor1BreathSlow = 0.09;
    public static double lightsColor1BreathFast = 0.11;
    public static double lightsColor1Shot = 0.13;
    public static double lightsColor1Strobe = 0.15;
    public static double lightsColor2BlendtoBlack = 0.17;
    public static double lightsColor2LarsonScanner = 0.19;
    public static double lightsColor2LightChase = 0.21;
    public static double lightsColor2HeartbeatSlow = 0.23;
    public static double lightsColor2HeartbeatMedium = 0.25;
    public static double lightsColor2HeartbeatFast = 0.27;
    public static double lightsColor2BreathSlow = 0.29;
    public static double lightsColor2BreathFast = 0.31;
    public static double lightsColor2Shot = 0.33;
    public static double lightsColor2Strobe = 0.35;
    public static double lightsSparkle1on2 = 0.37;
    public static double lightsSparkle2on1 = 0.39;
    public static double lightsGradient = 0.41;
    public static double lightsBeatsperMinute = 0.43;
    public static double lightsBlend1to2 = 0.45;
    public static double lightsBlend = 0.47;
    public static double lightsColors1and2 = 0.49;
    public static double lightsTwinkles = 0.51;
    public static double lightsColorWaves = 0.53;
    public static double lightsSinelon = 0.55;
    public static double lightsHotPink = 0.57;
    public static double lightsDarkRed = 0.59;
    public static double lightsRed = 0.61;
    public static double lightsRedOrange = 0.63;
    public static double lightsOrange = 0.65;
    public static double lightsGold = 0.67;
    public static double lightsYellow = 0.69;
    public static double lightsLawnGreen = 0.71;
    public static double lightsLime = 0.73;
    public static double lightsDarkGreen = 0.75;
    public static double lightsGreen = 0.77;
    public static double lightsBlueGreen = 0.79;
    public static double lightsAqua = 0.81;
    public static double lightsSkyBlue = 0.83;
    public static double lightsDarkBlue = 0.85;
    public static double lightsBlue = 0.87;
    public static double lightsBlueViolet = 0.89;
    public static double lightsViolet = 0.91;
    public static double lightsWhite = 0.93;
    public static double lightsGray = 0.95;
    public static double lightsDarkGray = 0.97;
    public static double lightsBlack = 0.99;

    // Climber Constants
    public static double climbSpeed = 1;
    public static boolean leftClimber = true;
    public static boolean rightClimber = false;
    public static double climberTop = -205;
    public static double climberMax = -280;
    public static double climberMid = -245;
    public static boolean climbersLocked = false;
    public static boolean climbersUnlocked = true;
    public static int climbToMid = 1;
    public static int climbToLeft = 2;
    public static int climbToRight = 3;

    // Shooter Constants
    public static double shooterClosePos = 0;
    public static double shooterClosekP = 0.0004;
    public static double shooterClosekI = 6e-7;
    public static double shooterClosekD = 0.00015;
    public static double shooterClosekIz = 500;
    public static double shooterClosekFF = 0.00015;

    public static double shooterMidPos = 0.75;
    public static double shooterMidkP = 0.0004;
    public static double shooterMidkI = 6e-7;
    public static double shooterMidkD = 0.00015;
    public static double shooterMidkIz = 500;
    public static double shooterMidkFF = 0.00015;

    // Forwards
    public static double shooterForFarPos = 0.75;
    public static double shooterForFarkP = 0.0005;
    public static double shooterForFarkI = 5e-7;
    public static double shooterForFarkD = 0.0002;
    public static double shooterForFarkIz = 500;
    public static double shooterForFarkFF = 0.00015;

    // Backwards
    public static double shooterRevFarPos = 0.7;
    public static double shooterRevFarkP = 0.0005;
    public static double shooterRevFarkI = 5e-7;
    public static double shooterRevFarkD = 0.0002;
    public static double shooterRevFarkIz = 500;
    public static double shooterRevFarkFF = 0.00014;

    // Mix
    public static double shooterMixFarPos = 0.72;
    public static double shooterMixFarkP = 0.0005;
    public static double shooterMixFarkI = 5e-7;
    public static double shooterMixFarkD = 0.0002;
    public static double shooterMixFarkIz = 500;
    public static double shooterMixFarkFF = 0.000145;

    public static double shooterkMaxOutput = 1;
    public static double shooterkMinOutput = 0;

    //Constants for various AUTO variables
    public static double autoDriveSpeed = -0.75;
    public static double autoDriveDistance = 40;

    //Base Constants
    public static int talonOneCANID = 1;
    public static int talonTwoCANID = 0;
    public static int talonThreeCANID = 2;
    public static int talonFourCANID = 3;
}