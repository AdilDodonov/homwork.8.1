package kg.geektech.game.general.kg.geektch.game.player.player;

public abstract class Hero extends GamwEntity implements havingSuperAdility {
    private SuperAbility ability;

    public Hero(int helth, int damage, SuperAbility ability, String name) {
        super(helth, damage, name);
        this.ability = ability;

    }
    public void hit(Boss boss){
        boss.setHelth(boss.getHelth() - this.getDamage());

    }

    public SuperAbility getAbility() {
        return ability;
    }
}
