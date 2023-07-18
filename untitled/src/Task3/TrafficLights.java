package Task3;

import java.util.Arrays;

public class TrafficLights {
    private String[] colors = {"red", "yellow", "green"};
    private int currentIndex;
    private String currentColor;
    private boolean state; // false - off;  true - on

    public String[] getColors() {
        String[] copy = new String[colors.length];
        System.arraycopy(colors, 0, copy, 0, colors.length);
        System.out.println(Arrays.toString(copy));
        return copy;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public void switchState() {
        if (state) {
            state = false;
            System.out.println("Світлофор вимкнений");
            currentColor = null;
        } else {
            state = true;
            currentColor = colors[0];
            currentIndex = 0;
            System.out.println("Світлофор увімкнений, поточний колір - " + currentColor);


        }
    }

    public void changeColor() {
        if (state) {
            currentIndex++;
            if (currentIndex == colors.length) {
                currentIndex = 0;
            }
            currentColor = colors[currentIndex];
            System.out.println("Поточний колір сфітлофора - " + currentColor);
        } else {
            System.out.println("Світлофор вимкнений. Щоб виконати операцію, увімкніть світлофор.");
        }
    }


}
