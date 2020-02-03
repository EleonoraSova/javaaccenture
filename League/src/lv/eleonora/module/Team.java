package lv.eleonora.module;

public class Team {
	
	private String name;
	private int wins;
	private int losses;
	private int ties;
	
	public Team(String nameOfTeam){
		this.name = nameOfTeam;
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", wins=" + wins + ", losses=" + losses
				+ ", ties=" + ties + ", getName()=" + getName()
				+ ", getWins()=" + getWins() + ", getLosses()=" + getLosses()
				+ ", getTies()=" + getTies() + "]";
	}

	public int gamesPlayed(){
		return this.wins + this.ties + this.losses;
	}
	}
	
