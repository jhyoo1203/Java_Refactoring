package kr.ac.gwnu.com.bowling;

public class Pin {

    private static final int MAX_BOWLING_PIN = 10;

    private int bowlingPins;

    public Pin() {
        resetPin();
    }

    public int rollingBall() {
        int randomNumber = (int)(Math.random() * bowlingPins) + 1;
        hitBowlingPin(randomNumber);
        return randomNumber;
    }

    public void resetPin() {
        this.bowlingPins = MAX_BOWLING_PIN;
    }

    private void hitBowlingPin(int hitBowlingpinCount) {
        this.bowlingPins -= hitBowlingpinCount;
    }
}
