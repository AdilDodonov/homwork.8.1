package kg.geektech.game.general.kg.geektch.game.player.player;

import kg.geektech.game.general.kg.geektch.game.player.general.RPG_Game;

public class Warior extends Hero {
    public Warior(int helth, int damage , String name ) {
        super(helth, damage, SuperAbility.CRITCAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficiennt = RPG_Game.random.nextInt(5)+1 ;
        boss.setHelth(boss.getHelth() - coefficiennt * this.getDamage());
        System.out.println(" Warior Hits Critical " + coefficiennt * this.getDamage());

    }
}
