package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hobbit extends Character implements Actions
{
    public void toCry()
    {
        System.out.println("don't kill me.....");
    }

    public void updateAbilities()
    {
        setHero(HeroesEnum.HOBBIT.getHero());
        setPower(HeroesEnum.HOBBIT.getMinPower());
        setHp(HeroesEnum.HOBBIT.getMaxHp());
    }

    public void kick(Character character)
    {
        toCry();
    }

    public boolean isAlive()
    {
        return this.getHp() > 0;
    }
}
