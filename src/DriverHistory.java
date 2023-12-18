/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DriverHistory {
    private String driverName;
    private double distance;
    private double time;

    public DriverHistory(String driverName, double distance, double time) {
        this.driverName = driverName;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Driver: " + driverName + ", Distance: " + distance + " km, Time: " + time + " hours";
    }
}
