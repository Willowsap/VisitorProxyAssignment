package structures;

/**
 * A node class to store Node data.
 * 
 * @author Willow Sapphire
 * @version 06/21/2023
 */
public class NodeNode extends Node
{
    /**
     * The Node data stored in this node.
     */
    private Node data;

    /**
     * Creates a new NodeNode with the given data.
     * 
     * @param data the data stored in the node.
     */
    public NodeNode(Node data)
    {
        this.data = data;
    }

    /**
     * Gets the data in the node.
     * 
     * @return node
     */
    public Node getData()
    {
        return data;
    }

    @Override
    public String describeData()
    {
        return String.format("Node -> %s", data.describeData());
    }
}
