package game.interfaces;

import game.heroes.Character;

public interface Actions
{
    void updateFields();
    void kick(Character hero);
    boolean isAlive();
}
