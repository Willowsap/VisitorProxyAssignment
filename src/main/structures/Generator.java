package structures;

public class Generator
{
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
        return getRandomList((int) Math.random() * 11 + 10);
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
        if (randomNum < .4)
        {
            return new IntNode((int) Math.random() * 1000);
        }
        else if (randomNum < .8)
        {
            return new DoubleNode(Math.random() * 1000);
        }
        else
        {
            return new NodeNode(getRandomList((int) (Math.random() * 10 + 1)));
        }
    }
}
