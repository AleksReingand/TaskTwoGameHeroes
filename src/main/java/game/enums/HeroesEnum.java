package game.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum HeroesEnum
{
    HOBBIT(1, "hobbit", 0, 0, 3, 3),
    ELF(2, "elf", 1, 10, 10, 10),
    KING(3, "king", 5, 15, 5, 15),
    KNIGHT(4, "knight", 2, 12, 2, 12);

    private final int index;
    private final String hero;
    private final int minPower;
    private final int maxPower;
    private final int minHp;
    private final int maxHp;

    public static HeroesEnum getHeroByIdx(int idx)
    {
        for(HeroesEnum hero : values())
        {
            if(idx == hero.getIndex())
                return hero;
        }
        return HOBBIT;
    }
}
