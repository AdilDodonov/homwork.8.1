package kg.geektech.game.general.kg.geektch.game.player.player;

import kg.geektech.game.general.kg.geektch.game.player.general.RPG_Game;

public class Witch extends  Hero {
    public Witch(int helth, int damage,String name) {
        super(helth, damage, SuperAbility.SACRIFASE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        boolean a = RPG_Game.random.nextBoolean();
        if (this.getHelth() > 0 && a == true){
            for (int i = 0; i < hero.length; i++) {
                if (hero[i].getHelth() <= 0 ){
                    hero[i].setHelth(this.getHelth() + hero[i].getHelth());
                    this.setHelth(0);
                    System.out.println(  " WITCH  SACRIFASE HERO");
                }
            }
        }
    }
}
