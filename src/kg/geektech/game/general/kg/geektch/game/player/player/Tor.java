package kg.geektech.game.general.kg.geektch.game.player.player;

import kg.geektech.game.general.kg.geektch.game.player.general.RPG_Game;

public class Tor extends  Hero {

    public Tor(int helth, int damage, String name) {
        super(helth, damage, SuperAbility.SILENCE , name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        boolean a = RPG_Game.random.nextBoolean();
        if (this.getHelth() > 0 && a == true ){
            boss.setDamage(0);
            System.out.println(" Tor silence Boss ");
        }else {
            boss.setDamage(50);
        }


    }
}
