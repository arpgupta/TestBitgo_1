import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    private Player p1;
    private Player p2;
    private Board board;
    private Random dice;

Main(){
    p1 = new Player("p1");
    p2 = new Player("p2");
    board = new Board();
    dice  = new Random();
}

private void playGamae(){
    Scanner  scanner = new Scanner(System.in);
    boolean won = false;
    System.out.println("Welcome to Game");
    while(!won){

    }
}

private boolean turn(Player p, Scanner scanner){
    System.out.println(p.getName()+" is turn");
    scanner.nextLine();
    int diceRoll = rollDice();
    System.out.println(p.getName()+" is rolled a"+ diceRoll);
    int newP = p.getPosition();
    if(newP>100){
        System.out.println(p.getName()+"need  an exact roll 100");
    }else {
        newP = board.checkSnake(newP);
        newP = board.checkLadder(newP);
        p.setPosition(newP);
        System.out.println(p.getName()+"moving to position"+  newP);
        if(p.hashCode()
    }
}
    public static void main(String[] args) {

    }

   private int rollDice(){
    return dice.nextInt(6)+1;
   }


}

