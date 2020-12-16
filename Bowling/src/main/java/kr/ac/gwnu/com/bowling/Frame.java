package kr.ac.gwnu.com.bowling;

public interface Frame {
    boolean hasTurn();

    void playBawling(int pinCount);

    int[] getScore();

    int getTotalScore();

    int getFrameNumber();

    String getState();
}
