package interfacegame;

public class Player1 implements Coach{
private String player_Name="Virat";
	
	public void play() {System.out.println("Playing Cricket");}
	
	public void run() {System.out.println("Running 10 km/day");}
	
	
	public static void main(String[] args) {
	    
		Player1 player1=new Player1();
		System.out.println("Player Name is : "+player1.player_Name);
		player1.play();
		player1.run();
	}

}
