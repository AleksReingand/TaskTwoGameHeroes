import game.CharacterFactory;
import game.heroes.Character;
import game.heroes.Hobbit;

public class GameManager
{
    public static void main(String[] args)
    {
        System.out.println(CharacterFactory.createCharacter().toString());
    }

    static void fight(Character ch1, Character ch2)
    {

    }
}
