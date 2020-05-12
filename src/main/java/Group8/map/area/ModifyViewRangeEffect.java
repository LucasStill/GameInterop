package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.ViewRange;
import Group8.map.area.EffectArea;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;

public class ModifyViewRangeEffect extends EffectArea<ViewRange> {

    private final ViewRange viewRange;

    public ModifyViewRangeEffect(MapObject parent, PointContainer pointContainer, ViewRange viewRange) {
        super(parent, pointContainer);
        this.viewRange = viewRange;
    }

    @Override
    public ViewRange get(AgentContainer<?> agentContainer) {
        return this.viewRange;
    }
}
