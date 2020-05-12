package Group8.map.objects;

import Group8.map.ViewRange;
import Group8.map.area.ModifySpeedEffect;
import Group8.map.area.ModifyViewRangeEffect;
import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Vision.ObjectPerceptType;

public class SentryTower extends MapObject {

    public SentryTower(PointContainer area, double sentrySlowdownModifier, ViewRange viewRange) {
        super(area, ObjectPerceptType.SentryTower);
        this.addEffects(
                new ModifySpeedEffect(this, area, sentrySlowdownModifier,sentrySlowdownModifier),
                new ModifyViewRangeEffect(this, area, viewRange)
        );
    }

}
