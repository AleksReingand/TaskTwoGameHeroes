package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class King extends Character implements Actions
{
    boolean isAlive = true;

    public void updateAbilities()
    {
        setHero(HeroesEnum.KING.getHero());
        setPower(HeroesEnum.KING.getMinPower());
        setHp(ToolsForHeroes.getHeroHp(HeroesEnum.KING));
    }

    public void kick(Character character)
    {
        int power = ToolsForHeroes.getHeroPower(HeroesEnum.KING);
        ToolsForHeroes.kickAction(power, this, character);
    }

    public boolean isAlive()
    {
        return this.getHp() > 0;
    }
}
