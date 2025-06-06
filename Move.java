package guessing;
public interface Move{
    int getDamage();
    int getHealing();
    
}

class Swing implements Move{
    private final int damage = 10;
    private final int healing = 0;
    @Override
    public int getDamage() {
        
        return damage;
    }
  @Override
    public int getHealing() {
        return healing;
    }
}

class heavySwing implements Move{
    private final int damage = 15;
    private final int healing = 0;
    @Override
    public int getDamage() {
        
        return damage;
    }
  @Override
    public int getHealing() {
        return healing;
    }
}

class HealngPotion implements Move{
    private final int damage = 0;
    private final int healing = 15;
    @Override
    public int getDamage() {
        
        return damage;
    }
   @Override
    public int getHealing() {
        return healing;
    }
}