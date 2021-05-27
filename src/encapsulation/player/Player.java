package encapsulation.player;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("player knocked out");
            // Reduce number of lives remaining for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
