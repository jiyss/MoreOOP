package ua.edu.ucu.apps2025.lab4;

import ua.edu.ucu.apps2025.lab4.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3, new HobbitKickStrategy());
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
