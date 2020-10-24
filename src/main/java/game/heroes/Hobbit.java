package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Hobbit extends Character implements Actions
{
    boolean isAlive = true;

    public void toCry()
    {
        System.out.println("don't kill me.....");
    }

    public void updateAbilities()
    {
        setHero(HeroesEnum.HOBBIT.getHero());
        setPower(ToolsForHeroes.getHeroPower(HeroesEnum.HOBBIT));
        setHp(ToolsForHeroes.getHeroHp(HeroesEnum.HOBBIT));
    }

    public void kick(Character character)
    {
        if(isAlive)
        {
            toCry();
            isAlive = ToolsForHeroes.kickAction(this, character);
        }
    }

    public boolean isAlive()
    {
        return isAlive;
    }
}
