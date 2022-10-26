package kg.geektech.game.general.kg.geektch.game.player.player;

public abstract class GamwEntity {
    private int helth;
    private int damage;
    private String name;

    public GamwEntity(int helth, int damage, String name) {
        this.helth = helth;
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        if (helth < 0 ){
        this.helth = 0;
        }else {
            this.helth = helth;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.getName() + "|  Heelth; " + this.getHelth() + "  Damage; " + this.getDamage();
    }
}
