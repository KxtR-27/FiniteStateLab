package lab;

public class Main {
    public static void main(String[] args) {
        Node root = new Node("This is the start.", false);
        Node win = new Node("You win!", true);
        Node think = new Node("Let's see here...", false);
        Node thinkWin = new Node("You thought long and hard, and you won!", true);
        Node thinkLose = new Node("You thought long and hard, but it wasn't enough. You lose!", true);

        root.addChoice("Win instantly!", win);
        root.addChoice("Think about it...", think);
        think.addChoice("Want to win?", thinkWin);
        think.addChoice("Want to lose?", thinkLose);

        Game game = new Game(root);

        game.playGame();

        System.exit(0);
    }
}
