package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Knight extends Character implements Actions
{
    boolean isAlive = true;

    public void updateAbilities()
    {
        setHero(HeroesEnum.KNIGHT.getHero());
        setPower(HeroesEnum.KNIGHT.getMinPower());
        setHp(ToolsForHeroes.getHeroHp(HeroesEnum.KNIGHT));
    }

    public void kick(Character character)
    {
        int power = ToolsForHeroes.getHeroPower(HeroesEnum.KNIGHT);
        ToolsForHeroes.kickAction(power, this, character);
    }

    public boolean isAlive()
    {
        return this.getHp() > 0;
    }
}
