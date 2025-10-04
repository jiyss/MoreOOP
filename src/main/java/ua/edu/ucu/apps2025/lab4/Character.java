package ua.edu.ucu.apps2025.lab4;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps2025.lab4.strategy.KickStrategy;

@Getter
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setKickStrategy(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }
}