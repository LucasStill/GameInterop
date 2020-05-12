package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.area.EffectArea;
import Group8.map.objects.MapObject;
import Group8.math.Vector2;
import Group8.tree.PointContainer;

public abstract class ModifyLocationEffect extends EffectArea<Vector2> {

    public ModifyLocationEffect(MapObject parent, PointContainer pointContainer) {
        super(parent, pointContainer);
    }

    @Override
    public abstract Vector2 get(AgentContainer<?> agentContainer);

}
