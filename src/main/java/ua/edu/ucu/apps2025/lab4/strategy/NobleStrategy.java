package ua.edu.ucu.apps2025.lab4.strategy;
import java.util.Random;

import ua.edu.ucu.apps2025.lab4.Character;

public class NobleStrategy extends KickStrategy{
    private static final Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        int enemyHp = enemy.getHp();
        enemy.setHp(enemyHp-RANDOM.nextInt(main.getPower()));
    }

}
