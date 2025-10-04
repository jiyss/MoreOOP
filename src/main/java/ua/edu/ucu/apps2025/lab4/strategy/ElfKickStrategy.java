package ua.edu.ucu.apps2025.lab4.strategy;
import ua.edu.ucu.apps2025.lab4.Character;

public class ElfKickStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character enemy) {
        if (enemy.getHp()<main.getHp()) {
            enemy.setHp(0);
        } else {
            enemy.setHp(enemy.getHp()-1);
        }
    }
}
