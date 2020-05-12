package Group8.Agent;

import Group8.Controller.Utils.Area;
import Group8.Controller.Utils.Scenario;
import Interop.Action.GuardAction;
import Interop.Agent.Guard;
import Interop.Percept.GuardPercepts;
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
public class OccupancyAgent implements Guard {
    private double xsize; //X size of map
    private double ysize; //Y size of map
    private double grid_size; //how thicc the wall assumption be.

    //For optimality sake OccupancyGrid().update() would determine whether log likelihood is 0.5 is (<,>).
    //I am leaving it incase we want to do some fancy data analytics.
    //private ArrayList<ArrayList<Double>> log_prob_map; //initially set to zero

    private double alpha = 1.0; //How thick can obstacles be
    private double beta = 5.0 * Math.PI/180; //width of FOV.
    private double z_max = 150.0; //how much info could be stored from the laser

    //Pre-allocate the x and y position of all the grid position on a 2D (might be 3D from the literature) tensor.  (Pre-process = faster)
    //TODO: copy x and y position into grid_position_m
    private ArrayList<Double> grid_position_m;

    //Log-probabilities to add or remove from the map
    private double log_occ = Math.log(0.65/0.35);
    private double log_free = Math.log(0.35/0.65);

    public OccupancyAgent() { }
//    public OccupancyAgent(double xsize, double ysize, double grid_size) {
//        this.xsize = xsize;
//        this.ysize = ysize;
//        this.grid_size = grid_size;
//
//        //pre-allocate grid_position_m
//        //self.grid_position_m = np.array([np.tile(np.arange(0, self.xsize*self.grid_size, self.grid_size)[:,None], (1, self.ysize)),np.tile(np.arange(0, self.ysize*self.grid_size, self.grid_size)[:,None].T, (self.xsize, 1))])
//    }

    //as defined in https://www.youtube.com/watch?v=Ko7SWZQIawM



    /**
     * gets the percept and converts it to free or occupied to a cell..
     */
    public void visionMeasure(){

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


    /**
     * This action is called by another agent, agent B, upon accessing a communication point made by agent A.
     * Agent B verifies false positive rate that of agent A's occupancyGrid.
     *
     * THIS SERVES AS DATA ANALYSIS FOR PHASE 3, TO SEE IF THERE ARE ANY POINTS OF IMPROVEMENTS!
     * !DO NOT CALL METHOD IN FINAL SUBMISSION, OR ELSE AGENT IS EVEN SLOWER!
     */
    public void verify() {

    }

    @Override
    public GuardAction getAction(GuardPercepts percepts) {
        return null;
    }
}
