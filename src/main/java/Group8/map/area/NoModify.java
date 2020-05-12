package Group8.map.area;

import Group8.agent.container.AgentContainer;
import Group8.map.area.EffectArea;

public class NoModify extends EffectArea<Double> {

    public NoModify() {
        super(null, null);
    }

    @Override
    public Double get(AgentContainer<?> agentContainer) {
        return 1D;
    }

}
