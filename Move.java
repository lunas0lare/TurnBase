package guessing;
public interface Move{
    int getDamage();
    int getHealing();
    int getStamina();
}

class Swing implements Move{
    private final int damage = 10;
    private final int healing = 0;
    private final int stamina = 5;
    @Override
    public int getDamage() {
        
        return damage;
    }
  @Override
    public int getHealing() {
        return healing;
    }

    @Override
    public int getStamina() {
        return stamina;
    }
}

class heavySwing implements Move{
    private final int damage = 15;
    private final int healing = 0;
    private final int stamina = 10;
    @Override
    public int getDamage() {
        
        return damage;
    }
    @Override
    public int getHealing() {
        return healing;
    }

    @Override
    public int getStamina() {
        return stamina;
    }
}

class HealngPotion implements Move{
    private final int damage = 0;
    private final int healing = 15;
    private final int stamina = 0;
    @Override
    public int getDamage() {  
        return damage;
    }
   @Override
    public int getHealing() {
        return healing;
    }
    @Override
    public int getStamina() {
        return stamina;
    }
}

class StaminaPotion implements Move{
    private final int damage = 0;
    private final int healing = 0;
    private final int stamina = 15;
    @Override
    public int getDamage() {  
        return damage;
    }
   @Override
    public int getHealing() {
        return healing;
    }
    @Override
    public int getStamina() {
        return stamina;
    }
}