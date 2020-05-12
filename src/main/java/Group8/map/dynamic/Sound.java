package Group8.map.dynamic;

import Group8.agent.container.AgentContainer;
import Group8.map.dynamic.DynamicObject;
import Interop.Percept.Sound.SoundPerceptType;

public class Sound extends DynamicObject<AgentContainer<?>> {

    private final SoundPerceptType type;

    public Sound(SoundPerceptType type, AgentContainer<?> source, double radius, int lifetime) {
        super(source, source.getPosition(), radius, lifetime);
        this.type = type;
    }

    public SoundPerceptType getType() {
        return type;
    }

    @Override
    public Sound clone() {
        return new Sound(type, getSource(), getRadius(), getLifetime());
    }
}