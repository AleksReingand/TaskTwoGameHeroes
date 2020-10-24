package game;

import game.heroes.Character;
import game.heroes.Elf;
import game.heroes.Hobbit;
import game.heroes.King;
import game.heroes.Knight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory
{
    public static Character createCharacter()
    {
        List<Character> billets = new ArrayList<Character>();

        billets.add(new Hobbit());

        billets.add(new Elf());

        billets.add(new King());

        billets.add(new Knight());


        return billets.get(new Random().nextInt(billets.size() - 1));
    }
}
