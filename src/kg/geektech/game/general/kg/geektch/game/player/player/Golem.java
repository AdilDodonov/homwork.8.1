package kg.geektech.game.general.kg.geektch.game.player.player;

public class Golem extends Hero {

    public Golem(int helth, int damage,  String name) {
        super(helth, damage,SuperAbility.SAVE_OTHER , name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        int nam = boss.getDamage() / 5;
        for (int i = 0; i < hero.length; i++) {
            if (this.getHelth() > 0 && hero[i].getHelth() > 0 && this != hero[i]){
                hero[i].setHelth(hero[i].getHelth() + boss.getDamage());
                this.setHelth( this.getHelth() - nam);
            }

        }
        System.out.println(" Golem SAVE OTHER " );

    }
}
