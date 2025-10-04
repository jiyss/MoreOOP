package ua.edu.ucu.apps2025.lab4.strategy;
import ua.edu.ucu.apps2025.lab4.Character;

public class KingKickStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character enemy) {
        int damage = (int) (Math.random() * main.getPower()) + 1;
        enemy.setHp(enemy.getHp() - damage);
    }
}
