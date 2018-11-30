package compiler;

import java.util.ArrayList;

//receiver
public class FuckBrainCommands {
    private int currentLocation = 0;
    private ArrayList<Character> chars;

    public FuckBrainCommands() {
        chars = new ArrayList<Character>();
        chars.add((char)0);
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public ArrayList<Character> getChars() {
        return chars;
    }

    public void refresh() {
        currentLocation = 0;
        chars = new ArrayList<Character>();
    }

    public void greater() {
        currentLocation++;
        if (currentLocation > chars.size() - 1)
            chars.add((char)0);
    }
    public void less() {
        if (currentLocation > 0)
            currentLocation--;
    }
    public void plus() {
        char currentChar = getCurrentChar();
        currentChar++;
        chars.set(currentLocation, currentChar);
    }
    public void minus() {
        char currentChar = getCurrentChar();
        currentChar--;
        chars.set(currentLocation, currentChar);
    }
    public void openBacket() {

    }
    public void closeBacket() {

    }
    public char getCurrentChar() {
        return chars.get(currentLocation);
    }
    public void dot() {
        System.out.print(getCurrentChar());
    }
}
