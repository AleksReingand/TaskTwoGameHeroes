package game.interfaces;

import game.heroes.Character;

public interface Actions
{
    void updateAbilities();
    void kick(Character hero);
    boolean isAlive();
}
