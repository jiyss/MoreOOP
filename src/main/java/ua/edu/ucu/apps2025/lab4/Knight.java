package ua.edu.ucu.apps2025.lab4;

public class Knight extends Noble{
    // private static final Random RANDOM = new Random();

    public Knight() {
        super(2, 12, 2, 12);
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
