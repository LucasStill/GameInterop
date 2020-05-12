package Group8.map.objects;

import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Vision.ObjectPerceptType;

public class TargetArea extends MapObject {

    public TargetArea(PointContainer.Polygon area) {
        super(area, ObjectPerceptType.TargetArea);
    }

}
