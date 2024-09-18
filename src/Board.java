import java.util.HashMap;
import java.util.Map;

public class Board {
    private static Map<Integer,Snake> snakes;
    private static  Map<Integer, Ladder> ladders;

    public Board(){
        snakes = new HashMap<>();
        ladders= new HashMap<>();
        initBoard();
    }
    private static void initBoard(){
        snakes.put(16, new Snake(16,6));
        snakes.put(47, new Snake(47,26));
        snakes.put(49, new Snake(49,11));
        snakes.put(56, new Snake(56,53));
        snakes.put(62, new Snake(62,19));
        snakes.put(87, new Snake(87,24));
        snakes.put(93, new Snake(93,73));
        snakes.put(98, new Snake(98,78));

        ladders.put(1, new Ladder(1,38));
        ladders.put(4, new Ladder(4,14));
        ladders.put(9, new Ladder(9,31));
        ladders.put(21, new Ladder(21,42));
        ladders.put(28, new Ladder(28,84));
        ladders.put(36, new Ladder(36,44));
        ladders.put(51, new Ladder(51,91));
        ladders.put(71, new Ladder(71,67));
        ladders.put(80, new Ladder(80,99));
    }
    public int checkSnake(int p){
        if(snakes.containsKey(p)){
            return snakes.get(p).tail;
        }
        return p;
    }
    public int checkLadder(int p){
        if(ladders.containsKey(p)){
            return ladders.get(p).getEnd();
        }
        return p;
    }

}
