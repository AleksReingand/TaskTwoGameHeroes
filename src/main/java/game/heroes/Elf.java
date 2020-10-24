package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Elf extends Character implements Actions
{

    boolean isAlive = true;


    public void updateAbilities()
    {
        setHero(HeroesEnum.ELF.getHero());
        setPower(ToolsForHeroes.getHeroPower(HeroesEnum.ELF));
        setHp(ToolsForHeroes.getHeroHp(HeroesEnum.ELF));
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
