package game.heroes;

import game.interfaces.Actions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Character implements Actions
{
    protected String hero;
    protected int power;
    protected int hp;


  public void updateAbilities()
  {

  }

  public void kick(Character hero)
  {

  }

  public boolean isAlive()
  {
    return false;
  }
}
