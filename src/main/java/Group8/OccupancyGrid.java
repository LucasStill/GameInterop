package Group8;


import java.util.ArrayList;

public class OccupancyGrid {
    //the higher the value of xsize and ysize the greater the accuracy at cost of complexity.
    private double xsize; //X size of map
    private double ysize; //Y size of map
    private double grid_size;

    //OccupancyGrid to be updated by the agent.
    ArrayList<ArrayList<Boolean>> occupancyGrid = new ArrayList<ArrayList<Boolean>>();

    public OccupancyGrid() {
        //instansiate all columns of occupancyGrid
        for(int i = 0; i <= ysize; i++) {
            occupancyGrid.add(new ArrayList<Boolean>());
        }

        //By setting occupancyGrid all to false we assume entire world is empty at instansiation of agent.
        //TODO: O(n^2) find better way of implementing.
        for(int i = 0; i <= xsize; i++) {
            for(int j = 0; j <= ysize; j++){
                occupancyGrid.get(i).add(i, false);
            }
        }
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
     * Updates the occupancy grid based on OccupancyAgent calculation.
     * This is called upon from the OccupancyAgent.
     * @param index the Arraylist index where the agent makes an update to.
     * @param occValue index set true if grid is occupied, else false.
     */
    public void update(int index, Boolean occValue) {
        occupancyGrid.add(new ArrayList<Boolean>());

    }
}
