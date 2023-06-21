package structures;

/**
 * A node class to store int data.
 * 
 * @author Willow Sapphire
 * @version 06/21/2023
 */
public class IntNode extends Node
{
    /**
     * The int data stored in this node.
     */
    private int data;

    /**
     * Creates a new IntNode with the given data.
     * 
     * @param data the data stored in the node.
     */
    public IntNode(int data)
    {
        this.data = data;
    }

    /**
     * Gets the data in the node.
     * 
     * @return node
     */
    public int getData()
    {
        return data;
    }

    @Override
    public String describeData()
    {
        return String.format("%d", data);
    }
}
