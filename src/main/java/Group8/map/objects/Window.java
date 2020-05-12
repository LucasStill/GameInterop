package Group8.map.objects;

import Group8.map.area.ModifySpeedEffect;
import Group8.map.area.ModifyViewEffect;
import Group8.map.area.SoundEffect;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Sound.SoundPerceptType;
import Interop.Percept.Vision.ObjectPerceptType;

public class Window extends MapObject {

    public Window(PointContainer.Polygon area,
                double guardViewModifier, double intruderViewModifier,
                double soundRadius,
                double guardSpeedModifier, double intruderSpeedModifier) {
        super(area, ObjectPerceptType.Window);
        this.addEffects(new ModifyViewEffect(this, area, guardViewModifier, intruderViewModifier),
                new SoundEffect(this, area, SoundPerceptType.Noise, soundRadius),
                new ModifySpeedEffect(this, area, guardSpeedModifier, intruderSpeedModifier));
    }

}
