public class Level{
    private boolean goalReached;
    private int points;
    //returns true if player reached goal on this level and false otherwise
    public boolean goalReached(){
        return goalReached;
    }
    public void reachGoal(){
        goalReached = true;
    }
    // returns number of points (pos int) recorded for this lvl
    public int getPoints(){
        return points;
    }
    public void setPoints(int p){
        points = p;
    }
}
