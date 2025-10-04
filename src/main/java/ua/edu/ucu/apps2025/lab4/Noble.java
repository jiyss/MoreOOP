package ua.edu.ucu.apps2025.lab4;

import java.util.Random;

import ua.edu.ucu.apps2025.lab4.strategy.KickStrategy;
import ua.edu.ucu.apps2025.lab4.strategy.NobleStrategy;

public class Noble extends Character{
    private static final Random RANDOM = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(RANDOM.nextInt(maxPower-minPower)+minPower, 
        RANDOM.nextInt(maxHp-minHp)+minHp, new NobleStrategy());
    }

    public Noble(int minPower, int maxPower, int minHp, int maxHp, KickStrategy kickStrategy) {
        super(RANDOM.nextInt(maxPower-minPower)+minPower, 
        RANDOM.nextInt(maxHp-minHp)+minHp, kickStrategy);
    }
}
