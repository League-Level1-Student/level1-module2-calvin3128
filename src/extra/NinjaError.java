package extra;

public class NinjaError {

/* Assume the Enemy class exists and has the required methods. */
	String alliegence;

    private void NinjaError(Enemy enemy, String alliegence) {
          this.alliegence = alliegence; 
          this.enemy = enemy;
     } 

     void sabotage() {
          enemy.infiltrate( );
          setOnFire(enemy.getLocation());
     } 


static void infiltrate(String who) {
          NinjaError nagato = new NinjaError("Nagato", "Nobunaga");
          NinjaError momochi = new NinjaError("Momochi", new Enemy());
     } 
} 