package kg.geektech.game.general.kg.geektch.game.player.player;

import kg.geektech.game.general.kg.geektch.game.player.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int helth, int damage, String name) {
        super(helth, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boost = RPG_Game.random.nextInt(6) + 5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getDamage() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + boost);
            }
        }
    }
}
