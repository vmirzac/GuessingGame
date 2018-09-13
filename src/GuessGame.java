public class GuessGame {

    // GuessGame has 3 instance variables for three Player object
    Player p1;
    Player p2;
    Player p3;

    //Create three Player objects and assign them to three Player instance variables
    public void startGame(){
        p1 =  new Player();
        p2 = new Player();
        p3 = new Player();

    //Declare three variables to hold the guesses the players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

    //Declare three variables to hold true or false based on Player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

    // Make a random "target" number that the Player has to guess
        int targetNumber = (int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while (true){
            System.out.println("Number to guess is " + targetNumber);
    //Call each player's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

     // Get each Player's guess (the result of their guess() method) by accessing the NUMBER variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player one guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player one guessed " + guessp3);

      // If Player1 or Player2 or Player3 is right
            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player One got it right ?" + p1isRight);
                System.out.println("Player Two got it right ?" + p2isRight);
                System.out.println("Player Three got it right ?" + p3isRight);
                break;
            }
            else{
         // Otherwise stay in the loop and ask the players for another guess
                System.out.println("Players will have to try again.");
            }
        }
    }
}
