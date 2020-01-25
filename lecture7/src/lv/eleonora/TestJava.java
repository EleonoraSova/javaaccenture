package lv.eleonora;

import lv.eleonora.player.FootballPlayer;

public class TestJava {
	
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 85);
		Circle figure = new Circle();
		
		System.out.println(figure.getColor()+" "+figure.getRadius());
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.getBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
		player.setShirtNumber(10);
		
		System.out.println("___________________");
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.getBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());

		}

}
