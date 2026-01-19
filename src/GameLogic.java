import  java.util.Scanner;

public class GameLogic {
    String player1;
    String player2;
    int plays = 0;

    Scanner sc = new Scanner(System.in);

    public GameLogic() {
        System.out.println("Enter Player 1 name");
        player1 = sc.nextLine();

        System.out.println("Enter Player 2 name");
        player2 = sc.nextLine();
    }

    public void turn()
    {
        while(plays%2==0)
        {
            System.out.println(player1 +"'s turn");
            System.out.println("Enter your column to play");
            int lastColumnP1 = sc.nextInt();
            plays++;
        }
        while(plays%2==1)
        {
            System.out.println(player1 +"'s turn");
            System.out.println("Enter your column to play");
            int lastColumnP2 = sc.nextInt();
            plays++;
        }
    }
}
