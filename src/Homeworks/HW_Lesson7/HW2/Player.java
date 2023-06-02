package Homeworks.HW_Lesson7.HW2;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }
}