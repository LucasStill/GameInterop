package Group8.Agent;

import Group8.Controller.Utils.Area;
import Group8.Controller.Utils.Scenario;
import Interop.Percept.Sound.SoundPercept;
import Interop.Percept.Sound.SoundPerceptType;
import Interop.Percept.Sound.SoundPercepts;
import Interop.Percept.Vision.FieldOfView;
import Interop.Percept.Vision.VisionPrecepts;

/**
 * @author Thomas Sijpkens
 * class OccupancyAgent uses and Occupancy grid representation of the environment.  This allows us to use ML approaches for the agent.
 */
public class OccupancyAgent {

    //TODO: check if this is how perception works
    //Line 19-42
    /**
     * @param visionPrecept the vision perception of a given agent
     * @return return a field of vision of a agent
     */

    public FieldOfView visionPercept(VisionPrecepts visionPrecept) {
        return null;
    }

    /**
     * @param soundPercept the sound percept of the agent
     * @param soundPerceptType the sound type heared by the agent
     * @return returns a field of sound percepts recognized by the agent
     */
    public SoundPercepts soundPercept(SoundPercept soundPercept, SoundPerceptType soundPerceptType) {
        return null;
    }

    /**
     *
     * @param perceivedEnvironment takes the visual perpect of the agent.
     * @return creates a subScenerio which will be feed to the larger Agent Perceived scenario.
     */
    public Scenario subScenario(Area perceivedEnvironment) {
        return null;
    }

    //as defined in https://www.youtube.com/watch?v=Ko7SWZQIawM
    /**
     * a binary random variable (0,1) with Mx,y:{free, occupied} -> {0,1}https://www.youtube.com/watch?v=Ko7SWZQIawM
     * Given some probability sapce (theta, P) a R.V. X: theta -> R is a function that maps the sample space to the reals.
     */
    public void Occupancy() {

    }

    /**
     * fine-grained grid map where an occupancy variable associated with each cell.
     * i.e. it is just an array of probability using Occupancy() Mx,y
     * Requires Bayesian filtering to maintain a occupancy grid map.
     *  Recursively update p(Mx,My) for each cell
     */
    public void OccupancyGridMap() {

    }


    /**
     * gets the percept and converts it to free or occupied to a cell..
     */
    public void visionMeasure(){

    }

    /**
     * There are only 4 conditional probabilities.
     * P(z = 1|Mx,y = 1) : True occupied measurement
     * P(z = 0|Mx,y = 1) : False free measurement
     * P(z = 1|Mx,y = 0) : False occupied measurement
     * P(z = 0|Mx,y = 0) : True free measurement
     */
    public void conditionalProbabilities() {
        //recall: P(A^c|B) = 1 - P(A | B)
    }

    /**
     * Converts our Prior Map to Posterior map using Bayes formula:
     * P(Mx,y | z) = (P(z | Mx,y) * P(Mx,y)) / P(z)
     */
    public void posteriorMap(){

    }

    /**
     * uses log odd update from: https://www.youtube.com/watch?v=kh35PqEFQxE
     */
    public void logOddUpdate() {

    }

    /**
     * @return an optimal estimate of the state of a acell given by a MAP decision rule
     * a cell C is Occupied if P[Mx,y = 1] > P(Mx,y = 0)
     * else if P[Mx,y = 1] > P(Mx,y = 0) then C is empty
     * otw, P[Mx,y = 1] = P(Mx,y = 0) then C is unknown.
     */
    public void maximumAPosteriori() {
        return;
    }

}
