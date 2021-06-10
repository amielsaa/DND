package BL;

public class Position  implements Comparable<Position> {

    private double x;
    private double y;

    public Position(double x,double y) {
        this.x = x;
        this.y = y;
    }

    private double range(double x2,double y2) {
        return Math.sqrt(Math.pow(x-x2,2) + Math.pow(y-y2,2));
    }

    //might need to be changed (not sure of its the correct implementation)
    @Override
    public int compareTo(Position o) {
        double range = range(o.x,o.y);
        if( range == 1 )
            return 1;
        else if(range == 0)
            return 0;
        return -1;
    }
}
