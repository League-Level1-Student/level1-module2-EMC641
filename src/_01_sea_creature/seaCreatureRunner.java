package _01_sea_creature;

public class seaCreatureRunner {
public static void main(String[] args) {
	

	
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	SeaCreature Patrick = new SeaCreature("Patrick");
	SeaCreature Squidward = new SeaCreature("Squidward");
	
	Spongebob.eat();
	Spongebob.laugh();
	
	Patrick.getName();
	Squidward.getName();
	
	Patrick.eat();
	Squidward.eat();
	
	Patrick.laugh();
	Squidward.laugh();
	
	
}
}
