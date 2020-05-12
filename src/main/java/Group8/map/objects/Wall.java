package Group8.map.objects;

import Group8.map.objects.MapObject;
import Group8.tree.PointContainer;
import Interop.Percept.Vision.ObjectPerceptType;

public class Wall extends MapObject {

    public Wall(PointContainer.Polygon area) {
        super(area, ObjectPerceptType.Wall);
    }

}
