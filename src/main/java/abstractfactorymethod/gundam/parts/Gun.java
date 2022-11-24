package abstractfactorymethod.gundam.parts;

public class Gun {
    private int attack;
    private int maxBullets;
    private int speed;

    public int getAttack() {
        return attack;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setMaxBullets(int maxBullets) {
        this.maxBullets = maxBullets;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
