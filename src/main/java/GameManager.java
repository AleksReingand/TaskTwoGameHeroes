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

        if(ch1 instanceof Hobbit && ch2 instanceof Hobbit)
        {
            System.out.println("Hey my friend, go to bar and drink!");
            return;
        }

        boolean wasKill = true;

        while(wasKill)
        {
            ch1.kick(ch2);
            System.out.println(ch2.getHero() + " live points: " + ch2.getHp());
            wasKill = ch2.isAlive();

            if (wasKill) {
                ch2.kick(ch1);
                System.out.println(ch1.getHero() + " live points: " + ch1.getHp());
                wasKill = ch1.isAlive();
            }
        }

        System.out.println((ch1.isAlive() ? ch2.getHero() : ch1.getHero()) + " is dead");
    }
}
