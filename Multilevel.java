package java5t2;



		// Parent class
		class Sport {
		    String name;

		    Sport(String name) {
		        this.name = name;
		    }

		    void play() {
		        System.out.println("Playing a sport: " + name);
		    }
		}

		// Child 1
		class TeamSport extends Sport {
		    int teamSize;

		    TeamSport(String name, int teamSize) {
		        super(name);
		        this.teamSize = teamSize;
		    }

		    void showTeamSize() {
		        System.out.println(name + " is played with " + teamSize + " players per team.");
		    }
		}

		// Child 2 (multilevel)
		class Cricket extends TeamSport {
		    String format;

		    Cricket(String name, int teamSize, String format) {
		        super(name, teamSize);
		        this.format = format;
		    }

		    void showFormat() {
		        System.out.println(name + " format: " + format);
		    }
		}

		// Main class
		public class Multilevel {
		    public static void main(String[] args) {
		        Cricket match = new Cricket("Cricket", 11, "ODI");

		        match.play();          // from Sport
		        match.showTeamSize();  // from TeamSport
		        match.showFormat();    // from Cricket
		    }
		}

	


