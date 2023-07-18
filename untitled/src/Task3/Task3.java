package Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.getColors();
        System.out.println(trafficLights.getCurrentColor());
        trafficLights.changeColor();
        trafficLights.switchState();
        trafficLights.changeColor();
        trafficLights.changeColor();
        trafficLights.changeColor();
        trafficLights.changeColor();

        trafficLights.switchState();

        System.out.println(trafficLights.getCurrentColor());
    }
}
