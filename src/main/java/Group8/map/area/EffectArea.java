package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.objects.MapObject;
import Group8.tree.Container;
import Group8.tree.PointContainer;

public abstract class EffectArea<T> implements Container<PointContainer> {

    private final MapObject parent;
    private final PointContainer pointContainer;

    public EffectArea(MapObject parent, PointContainer pointContainer)
    {
        this.parent = parent;
        this.pointContainer = pointContainer;
    }

    public MapObject getParent() {
        return parent;
    }

    abstract public T get(AgentContainer<?> agentContainer);

    @Override
    public PointContainer getContainer() {
        return pointContainer;
    }

}
