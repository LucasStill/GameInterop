package Group8.map.objects;

import Group8.map.area.ModifyViewEffect;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Vision.ObjectPerceptType;

public class ShadedArea extends MapObject {
    public ShadedArea(PointContainer area, double guardModifier, double intruderModifier) {
        super(area, ObjectPerceptType.ShadedArea);
        this.addEffects(new ModifyViewEffect(this, area, guardModifier, intruderModifier));
    }
}
