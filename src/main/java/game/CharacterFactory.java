package game;

import game.enums.HeroesEnum;
import game.heroes.Character;
import game.heroes.Elf;
import game.heroes.Hobbit;
import game.heroes.King;
import game.heroes.Knight;

import java.util.ArrayList;
import java.util.List;

public class CharacterFactory
{
    public static Character createCharacter()
    {
        List<Character> heroes = new ArrayList<Character>();

        Character hobbit = (Hobbit)Character.builder()
                .hero(HeroesEnum.HOBBIT.getHero())
                .power(HeroesEnum.HOBBIT.getMaxPower())
                .hp(HeroesEnum.HOBBIT.getMaxHp()).build();

        heroes.add(hobbit);

        Character elf = (Elf)Character.builder()
                .hero(HeroesEnum.ELF.getHero())
                .power(HeroesEnum.ELF.getMaxPower())
                .hp(HeroesEnum.ELF.getMaxHp()).build();

        heroes.add(elf);

        Character king = (King)Character.builder()
                .hero(HeroesEnum.KING.getHero())
                .power(HeroesEnum.KING.getMaxPower())
                .hp(HeroesEnum.KING.getMaxHp()).build();

        heroes.add(king);

        Character knight = (Knight)Character.builder()
                .hero(HeroesEnum.KNIGHT.getHero())
                .power(HeroesEnum.KNIGHT.getMaxPower())
                .hp(HeroesEnum.KNIGHT.getMaxHp()).build();

        heroes.add(knight);


        return heroes.get((int)(Math.random() * (heroes.size() - 0 + 1)));
    }
}
