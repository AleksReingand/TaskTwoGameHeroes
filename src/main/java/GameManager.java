import game.CharacterFactory;
import game.heroes.Character;
import game.heroes.Hobbit;

public class GameManager
{
    public static void main(String[] args)
    {
        Character ch1 = CharacterFactory.createCharacter();
        ch1.updateAbilities();
        Character ch2 = CharacterFactory.createCharacter();
        ch2.updateAbilities();

        fight(ch1, ch2);
    }

    static void fight(Character ch1, Character ch2)
    {
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());

        boolean wasKill = false;

        while(!wasKill)
        {
            ch1.kick(ch2);
            wasKill = ch1.isAlive();

            if(wasKill)
            {
                ch2.kick(ch1);
                wasKill = ch2.isAlive();
            }
        }
    }
}
