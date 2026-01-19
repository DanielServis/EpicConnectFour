//All static classes, methods and objects will be called here
//This is where the game is played

public class Main {
    public static void main(String[] args)
    {
        Chip chip1 = new Chip(true);
        Chip chip2 = new Chip(false);
        chip1.printChip();
        System.out.println();
        chip2.printChip();
    }
}
