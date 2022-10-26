package kg.geektech.game.general.kg.geektch.game.player.player;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(int helth, int damage, String name ) {
        super(helth, damage, SuperAbility.SAVE_DAMAGE_AND_REVWRD, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        hit(boss);
    }

    public int getSavedDamage(){
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage){
        this.savedDamage = savedDamage;
    }
    public void hit(Boss boss){
        if (this.getHelth() > 0 && boss.getHelth() > 0 ){
            boss.setHelth(boss.getHelth()
            - this.getDamage() - this.getSavedDamage());

        }
    }
}
