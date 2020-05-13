package Group8.tree;

import Group8.math.Vector2;
import Group8.tree.Node;
import Group8.tree.PointContainer;

public class QuadTree<T> {

    private final Group8.tree.Node<T> root;
    private final Vector2 translateToTreeOrigin;
    private final Vector2 translateToRealOrigin;

    private TransferFunction<T> transferFunction;

    public QuadTree(int width, int height, int maxDepth, TransferFunction<T> transferFunction)
    {
        this.translateToTreeOrigin = new Vector2(-width / 2D, -height / 2D);
        this.translateToRealOrigin = this.translateToTreeOrigin.mul(-1, -1);

        this.root = new Group8.tree.Node<>(new Vector2(0, 0), width, height, 5, maxDepth);
        this.transferFunction = transferFunction;
    }

    public void add(T value)
    {
        PointContainer pointContainer = null;
        try {
            pointContainer = transferFunction.transfer(value).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        pointContainer.translate(this.translateToTreeOrigin);
        this.root.add(new Group8.tree.Node.Content<>(value, pointContainer), 1);
    }

    public interface TransferFunction<T> {

        PointContainer transfer(T o);

    }

}