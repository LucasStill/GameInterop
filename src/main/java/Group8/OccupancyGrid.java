package Group8;

import java.util.ArrayList;

public class OccupancyGrid {
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
}
