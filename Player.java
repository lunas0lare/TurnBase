package guessing;
abstract class Player {
    public static final int DEFAULT_HP = 100;
    public static final int DEFAULT_STAMINA = 100;
    private int health;
    private int stamina;
    public Player() {
        this.health = DEFAULT_HP;
        this.stamina = DEFAULT_STAMINA;
    }

    public Player(int health, int stamina){
        this.health = health;
        this.stamina = stamina;
    }

    public void setHP(int health){
        this.health = health;
    }

    public int getHP(){
        return health;
    }
    
    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public int getStamina(){
        return stamina;
    }

    public void useMove(Move move, Player player){
        int damage = move.getDamage();
        if(damage > 0){
            int newHP = player.getHP() - damage;
            player.setHP(Math.max(newHP, 0));
        }

        int healing = move.getHealing();
        if(healing > 0){
            int newHP = player.getHP() + healing;
            player.setHP(newHP);
        }

        int stamina = move.getStamina();
        if(stamina > 0){
            int newStamina = player.getStamina() - stamina;
            player.setStamina(Math.max(newStamina, 0));
        }
    }

}

class Human extends Player {
     public Human(){
        super(150, 150);
    }
}

class Computer extends Player{
    public Computer(){
        super(DEFAULT_HP, DEFAULT_STAMINA);
    }
}

class Orc extends Player{
    public Orc(){
        super(200, 200);
    }
}
