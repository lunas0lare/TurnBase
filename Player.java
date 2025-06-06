package guessing;
abstract class Player {
    static final int HP = 100;
    private int health;
    public Player() {
        this.health = HP;
    }

    public void setHP(int health){
        this.health = health;
    }
    public int getHP(){
        return health;
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
    }
}

class Human extends Player {
    
}

class Computer extends Player{

}

