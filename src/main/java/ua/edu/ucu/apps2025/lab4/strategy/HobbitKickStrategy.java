package ua.edu.ucu.apps2025.lab4.strategy;
import ua.edu.ucu.apps2025.lab4.Character;

public class HobbitKickStrategy extends KickStrategy{

    @Override
    public void kick(Character main, Character enemy) {
        System.out.println("Cry a lot");
    }
}
