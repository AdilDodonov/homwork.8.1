package kg.geektech.game.general.kg.geektch.game.player.player;

public class Medic extends Hero {
    private  int healPoints;
    public Medic(int helth, int damage, int healPoints, String name ) {
        super(helth, damage, SuperAbility.HEAL, name);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes[i].getHelth() > 0 && this != heroes[i]) {
                heroes[i].setHelth(heroes[i].getHelth() + this.healPoints  );

            }

        }

    }
}
