package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Knight extends Character implements Actions
{
    boolean isAlive = true;

    public void updateFields()
    {
        setHero(HeroesEnum.KNIGHT.getHero());
        setPower(ToolsForHeroes.getHeroPower(HeroesEnum.KNIGHT));
        setHp(ToolsForHeroes.getHeroHp(HeroesEnum.KNIGHT));
    }

    public void kick(Character character)
    {
        if(isAlive)
        {
            isAlive = ToolsForHeroes.kickAction(this, character);
        }
    }

    public boolean isAlive()
    {
        return isAlive;
    }
}
