package kg.geektech.game.general.kg.geektch.game.player.player;

import kg.geektech.game.general.kg.geektch.game.player.general.RPG_Game;

public class Boss extends GamwEntity {
    private SuperAbility defence;

    public Boss(int helth, int damage, String name) {
        super(helth, damage, name);

    }

    public void choosDefence(Hero[] heroes){
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }



    public void hit(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0) {
                heroes[i].setHelth(heroes[i].getHelth() - this.getDamage());
            }
        }

    }

    public SuperAbility getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return " Boos " + super.toString() + " Defens| " + (this.getDefence() == null ? "NO Defens" : this.getDefence());
    }
}
