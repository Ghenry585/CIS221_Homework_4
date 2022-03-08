/* Gary Henry
CIS221
3/7/2022
Tuesdays and Thrusdays (2:10pm to 4:00pm)
Professor: Mr.Swinarski 
CIS221 Homework_4*/

class Console { // create superclass class 'Console'

    private String game; // create private variable 'game'

    public String getConsole(String consoleName) { // method for getting the console name
        System.out.println("I Love " + consoleName + "!!!");
        return consoleName;
    }

    public String getGame() { // getter that returns the private variable 'game'
        return game;
    }

    public void setGame(String newGame) { // setter that sets the private variable value for 'game'
        this.game = newGame;
    }
}

class Xmas extends Console { // subclass Xmas that gets all of the methods from the Console class
    public static void main(String[] args) { // main method

        Xmas myConsole = new Xmas(); // create new object of Xmas class
        myConsole.setGame("Elden Ring"); // pass data to the setter for 'game'
        myConsole.getConsole("Xbox"); // pass data to the method from the Console class
        System.out.println("My favorite game at the moment is " + myConsole.getGame() + ".");
    }
}