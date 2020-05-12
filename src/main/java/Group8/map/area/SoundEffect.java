package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.area.EffectArea;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Sound.SoundPerceptType;

public class SoundEffect extends EffectArea<Double> {

    private SoundPerceptType type;
    private double radius;

    public SoundEffect(MapObject parent, PointContainer pointContainer, SoundPerceptType type, double radius) {
        super(parent, pointContainer);
        this.type = type;
        this.radius = radius;
    }

    public SoundPerceptType getType()
    {
        return this.type;
    }

    @Override
    public Double get(AgentContainer<?> agentContainer) {
        return this.radius;
    }

}