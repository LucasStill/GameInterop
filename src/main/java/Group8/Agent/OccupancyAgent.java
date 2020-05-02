package Group8.Agent;

import Group8.Controller.Utils.Area;
import Group8.Controller.Utils.Scenario;
import Interop.Percept.Sound.SoundPercept;
import Interop.Percept.Sound.SoundPerceptType;
import Interop.Percept.Sound.SoundPercepts;
import Interop.Percept.Vision.FieldOfView;
import Interop.Percept.Vision.VisionPrecepts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thomas Sijpkens
 * class OccupancyAgent uses and Occupancy grid representation of the environment.  This allows us to use ML approaches for the agent.
 */
public class OccupancyAgent {
    private double xsize; //X size of map
    private double ysize; //Y size of map
    private double grid_size;
    private ArrayList<Double> log_prob_map; //initially set to zero

    private double alpha = 1.0; //How thick can obstacles be
    private double beta = 5.0 * Math.PI/180; //width of FOV.
    //TODO: modify beta on how wide the FieldOfView is.
    private double z_max = 150.0; //how much info could be stored from the laser

    //Pre-allocate the x and y position of all the grid position on a 2D (might be 3D from the literature) tensor.  (Pre-process = faster)
    //TODO: copy x and y position into grid_position_m
    private ArrayList<Double> grid_position_m;

    //Log-probabilities to add or remove from the map
    private double log_occ = Math.log(0.65/0.35);
    private double log_free = Math.log(0.35/0.65);

    public OccupancyAgent(double xsize, double ysize, double grid_size) {
        this.xsize = xsize;
        this.ysize = ysize;
        this.grid_size = grid_size;

        //pre-allocate grid_position_m
        //self.grid_position_m = np.array([np.tile(np.arange(0, self.xsize*self.grid_size, self.grid_size)[:,None], (1, self.ysize)),np.tile(np.arange(0, self.ysize*self.grid_size, self.grid_size)[:,None].T, (self.xsize, 1))])
    }

    public void updateMap(double[] pose, double[] z) {
        List<Double> dx = new ArrayList<>(grid_position_m); //tensor of coordinates of all cells
        //matrix of all x coordinate of cell
        //matrix of all y coordinate of cell
        //matrix of all bearings from robot to cell

        //wrap to +pi/-pi

        //for each laser beam(where we update
    }

    //TODO: check if this is how perception works
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
