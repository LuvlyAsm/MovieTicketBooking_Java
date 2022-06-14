package interfacegame;

public class Player2 implements Coach{
private String player_Name="KL Rahul";
	
	public void play() {System.out.println("Playing Cricket");}
	
	public void run() {System.out.println("Running 8 km/day");}
	
	
	public static void main(String[] args) {
	    
		Player2 player2=new Player2();
		System.out.println("Player Name is : "+player2.player_Name);
		player2.play();
		player2.run();
	}

}
