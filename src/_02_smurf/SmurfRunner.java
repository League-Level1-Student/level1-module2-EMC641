package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf Handy = new Smurf("Handy");
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	Smurf Smurfette = new Smurf("Smurfette");

	Handy.eat();
	Handy.getName();
	
	PapaSmurf.getName();
	PapaSmurf.getHatColor("red");
	PapaSmurf.isGirlOrBoy("boy");
	
	Smurfette.getName();
	Smurfette.getHatColor("white");
	Smurfette.isGirlOrBoy("female");
	
	
	
}
}
