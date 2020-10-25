package game.toolsForGame;

import game.enums.HeroesEnum;
import game.heroes.Character;
import game.heroes.Hobbit;

public class ToolsForHeroes
{
    /**
     *
     * @param hero
     * @return random number from range
     */
    public static int getHeroPower(HeroesEnum hero)
    {
        int minPower = hero.getMinPower();
        int maxPower = hero.getMaxPower();
        int range = maxPower - minPower + 1;

        return (int)(Math.random() * range) + minPower;
    }

    /**
     *
     * @param hero
     * @return random number from range
     */
    public static int getHeroHp(HeroesEnum hero)
    {
        int minHp = hero.getMinHp();
        int maxHp = hero.getMaxHp();
        int range = maxHp - minHp + 1;

        return (int)(Math.random() * range) + minHp;
    }

    public static void kickAction(int power, Character hero, Character character)
    {
        System.out.println("I am " + hero.getHero() + "! Are you ready to dead?!");
        character.setHp(character.getHp() - power);
        System.out.println("-" + power + " from " + character.getHero());
    }
}
