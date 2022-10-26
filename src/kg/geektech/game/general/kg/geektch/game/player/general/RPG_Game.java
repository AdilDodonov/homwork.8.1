package kg.geektech.game.general.kg.geektch.game.player.general;

import kg.geektech.game.general.kg.geektch.game.player.player.*;

import java.util.Random;
import java.util.logging.SocketHandler;

public class RPG_Game {
    private static int namberRount;
    public static Random random = new Random();


    public static void startGame() {

        Boss boss = new Boss(1000, 50, " Lord ");
        Tor tor = new Tor(200, 20, "Tor");
        Witch witch = new Witch( 200, 20, "Wedima");
        Golem golem = new Golem( 300, 20, " Golem ");
        Warior warior = new Warior(290, 30, " фрйя ");
        Medic medic = new Medic(250, 5, 15, " Estes ");
        Magic magic = new Magic(280, 30, " Weil ");
        Berserk berserk = new Berserk(270, 15, " Macha ");
        Medic medic1 = new Medic(265, 5, 5, " Estes2 ");
        Hero[] heroes = {warior, medic, magic, berserk, medic1, witch, tor, golem};
        prinetStatic(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            pleyRound(boss, heroes);
        }
    }

    private static void pleyRound(Boss boss, Hero[] heroes) {
        namberRount++;
        boss.choosDefence(heroes);
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0 && boss.getHelth() > 0 && boss.getDefence() != heroes[i].getAbility()) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }

        }
        prinetStatic(boss, heroes);
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHelth() <= 0) {
            System.out.println(" Heroth WOM!!! ");
            return true;
        }
        boolean allHerosDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHelth() > 0) {
                allHerosDead = false;
                break;
            }
        }
        if (allHerosDead) {
            System.out.println(" BOSS WON!!! ");
        }
        return allHerosDead;
    }


    private static void prinetStatic(Boss boss, Hero[] heroes) {
        System.out.println("========== ROUND " + namberRount + "===========");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);

        }


    }
}
