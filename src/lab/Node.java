package lab;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final String text;
    private final boolean isEndNode;
    private final List<Choice> choices;

    public Node(String text, boolean isEndNode) {
        this.text = text;
        this.isEndNode = isEndNode;

        choices = new ArrayList<>();
    }


    public void addChoice(String description, Node node) {
        choices.add(new Choice(description, node));
    }

    public boolean isEndNode() {
        return this.isEndNode;
    }

    public Node chooseNextNode(int index) {
        return choices.get(index).node();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%n%s%n", this.text));

        for (int i = 0; i < choices.size(); i++) {
            Choice choice = choices.get(i);
            builder.append(String.format("[%d] %s%n", i+1, choice));
        }

        return builder.toString();
    }
}

record Choice(String description, Node node) {

    @Override
    public String toString() {
        return description;
    }
}