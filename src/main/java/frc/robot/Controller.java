package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    private XboxController manipController;
    public Controller() {
        System.out.println("hello");
        manipController = new XboxController(0);
    }
    public boolean yoinkOrb() {
        return manipController.getAButton();
    }       
 }