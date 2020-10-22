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

    public static boolean kickAction(Character left, Character right)
    {
        int hp = left.getHp();
        int power = right.getPower();

        if(hp - power <= 0)
        {
            System.out.println("Ah! You killed me...");
            System.out.println(right.getHero() + " killed " + left.getHero());
            return false;
        }
        return true;
    }
}
