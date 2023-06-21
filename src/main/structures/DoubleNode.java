package structures;

/**
 * A node class to store double data.
 * 
 * @author Willow Sapphire
 * @version 06/21/2023
 */
public class DoubleNode extends Node
{
    /**
     * The double data stored in this node.
     */
    private double data;

    /**
     * Creates a new DoubleNode with the given data.
     * 
     * @param data the data stored in the node.
     */
    public DoubleNode(double data)
    {
        this.data = data;
    }

    /**
     * Gets the data in the node.
     * 
     * @return node
     */
    public double getData()
    {
        return data;
    }

    @Override
    public String describeData()
    {
        return String.format("%f", data);
    }
}
