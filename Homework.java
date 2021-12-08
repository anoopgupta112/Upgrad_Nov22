
package Object_Oriented_Programing;

class Player {
	public Player(String playerName, int hitPoint) {
		this.playerName = playerName;
		this.hitPoint = hitPoint;
		
	}
	public Player(String playerName) {
		this.playerName = playerName;
	}


	private String playerName;
	private int hitPoint;
	private boolean alive = true;
	private int damage;

public void getHit(int damage) {
	
	this.damage = damage;
}
public int setHit() {
	return damage;
}

public boolean isAlive() {
   
	if(sethitPoint() == 0) {
		alive = false;
	}
	
	
	return alive;
}
public void getPlayer(String playerName) {
	this.playerName = playerName;
	
}
public void gethitPoint(int hitPoint) {
	this.hitPoint = hitPoint;
}

public String setPlayerName() {
	return playerName;
}

public int sethitPoint() {
	return hitPoint-damage;
}



}

public class Homework{

	  public static void main(String[] args){
	      
	    	
			Player player = new Player("Harry", 1000);
				
				System.out.println(player.isAlive());
				System.out.println(player.sethitPoint());
				
			    player.getHit(500);
			    player.getHit(200);
		        player.getHit(400);

				
				System.out.println(player.isAlive());
				System.out.println(player.sethitPoint());
		    	
		    	
		        
		        
		    }

     
}





