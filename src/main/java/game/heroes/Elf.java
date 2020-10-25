package game.heroes;

import game.enums.HeroesEnum;
import game.interfaces.Actions;
import game.toolsForGame.ToolsForHeroes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Elf extends Character implements Actions
{
    public void updateAbilities()
    {
        setHero(HeroesEnum.ELF.getHero());
        setPower(HeroesEnum.ELF.getMaxPower());
        setHp(HeroesEnum.ELF.getMaxHp());
    }


    public void kick(Character character)
    {
        if(this.getPower() > character.getPower())
        {
            System.out.println("You are weaker then me! Ha-ha-ha");
            character.setHp(character.getHp() - this.getPower());
        }
        else
        {
            ToolsForHeroes.kickAction(HeroesEnum.ELF.getMinPower(), this, character);
        }
    }

    public boolean isAlive()
    {
        return this.getHp() > 0;
    }
}
