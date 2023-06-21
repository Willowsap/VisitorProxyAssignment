package structures;

/**
 * Simple linked list node.
 * 
 * @author Willow Sapphire
 * @version 06/21/2023
 */
public abstract class Node
{
    /**
     * The next node in the list.
     */
    private Node next;
    
    /**
     * Gets the next node in the list.
     * 
     * @return next
     */
    public Node next()
    {
        return next;
    }

    /**
     * Sets the next node.
     * 
     * @param next the new next node
     */
    public void setNext(Node next)
    {
        this.next = next;
    }

    /**
     * Use describeData for the toString.
     * 
     * @return String describeData
     */
    public String toString()
    {
        return describeData();
    }

    /**
     * Describes the data in the node as a string.
     * 
     * @return a string describing the data
     */
    public abstract String describeData();

    /**
     * Prints a given list.
     */
    public static void printList(Node head)
    {
        for (Node curr = head; curr.next() != null; curr = curr.next())
        {
            System.out.println(curr);
        }
    }

    /**
     * Gets a random list with the provided number of primary nodes.
     * 
     * @param numNodes
     * @return
     */
    public static Node getRandomList(int numNodes)
    {
        Node head = getRandomNode();
        Node curr = head;
        for (int i = 0; i < numNodes - 1; i++)
        {
            curr.setNext(getRandomNode());
            curr = curr.next();
        }
        return head;
    }

    /**
     * Gets a random list with between 10 and 20 primary nodes.
     * 
     * @return a random list with between 10 and 20 primary nodes
     */
    public static Node getRandomList()
    {
        return getRandomList((int) (Math.random() * 11 + 10));
    }

    /**
     * Gets a random type of node.
     * For int and nodes, the data will be between 0 and 999
     * For node nodes, the data will be a list of between 1 and 9 items
     * 
     * @return the random node
     */
    public static Node getRandomNode()
    {
        double randomNum = Math.random();
        if (randomNum < .45)
        {
            return new IntNode((int) (Math.random() * 1000));
        }
        else if (randomNum < .9)
        {
            return new DoubleNode(Math.random() * 1000);
        }
        else
        {
            return new NodeNode(getRandomList((int) (Math.random() * 10 + 1)));
        }
    }
}
