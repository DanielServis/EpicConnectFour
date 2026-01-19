import  java.util.Scanner;

public class GameLogic {
    String player1;
    String player2;
    static int plays = 0;
    int col;
    boolean playing = true;

    Scanner sc = new Scanner(System.in);

    public GameLogic() {
        System.out.println("Enter Player 1 name");
        player1 = sc.nextLine();

        System.out.println("Enter Player 2 name");
        player2 = sc.nextLine();

        while(playing)
        {
            plays(plays);
        }
    }

    public int plays(int plays)
    {

        int col = turn(plays%2);
        return plays%2 + 1;

    }

    public int turn(int player)
    {

        if(player == 0)
        {
            System.out.println(player1 + "'s turn");
            System.out.println("Enter your column to play");
            int lastColumnP1 = sc.nextInt();
            plays++;
            return lastColumnP1;
        }
        else if (player == 1)
        {
            System.out.println(player2 + "'s turn");
            System.out.println("Enter your column to play");
            int lastColumnP2 = sc.nextInt();
            plays++;
            return lastColumnP2;
        }
        else return 303;
    }

    public int getCol()
    {
        return col;
    }
}


