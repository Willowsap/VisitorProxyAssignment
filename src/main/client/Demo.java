package client;

import structures.Node;

/**
 * Demo for the visitor proxy assignment.
 * 
 * @author
 * @version
 */
public class Demo
{
    /**
     * Runs the demo.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        Node list = Node.getRandomList(25);
        Node.printList(list);
    }
}
