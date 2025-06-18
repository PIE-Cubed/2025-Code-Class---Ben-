package frc.robot;

public class Wheels {

    private double location;

    public Wheels(double pos) {
        System.out.println("if you can read, then you have read this");
        location = pos;
    }

    public double getPos() {
        System.out.println("whatever!" + location);
        return location;
    }

}