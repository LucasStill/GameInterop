package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.area.EffectArea;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Agent.Guard;
import Interop.Agent.Intruder;

public class ModifyViewEffect extends EffectArea<Double> {

    private double guardModifier;
    private double intruderModifier;

    public ModifyViewEffect(MapObject parent, PointContainer pointContainer, double guardModifier, double intruderModifier) {
        super(parent, pointContainer);
        this.guardModifier = guardModifier;
        this.intruderModifier = intruderModifier;
    }

    @Override
    public Double get(AgentContainer<?> agentContainer) {

        if(agentContainer.getAgent() instanceof Guard)
        {
            return this.guardModifier;
        }
        else if(agentContainer.getAgent() instanceof Intruder)
        {
            return this.intruderModifier;
        }

        throw new IllegalStateException();

    }
}
