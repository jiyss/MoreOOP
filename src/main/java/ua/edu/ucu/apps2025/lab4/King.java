package ua.edu.ucu.apps2025.lab4;
import ua.edu.ucu.apps2025.lab4.strategy.KingKickStrategy;

public class King extends Noble{
    // private static final Random RANDOM = new Random();

    public King() {
        super(5, 15, 5, 15, new KingKickStrategy());
    }

    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}