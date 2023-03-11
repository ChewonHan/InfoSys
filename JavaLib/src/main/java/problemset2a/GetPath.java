package problemset2a;


import java.util.ArrayList;

public class GetPath {

    public static void main(String[] args) {

        // case 1
        final int [][] grid0 = { {0,0,0,0},
                                {0,0,1,0},
                                {0,0,0,1},
                                {0,1,0,0} };
        ArrayList<Point1> path = new ArrayList<>();
        boolean success = GetPath.getPath(3,2,path, grid0);
        System.out.println(success);
        if (success) System.out.println(path);
        path.clear();

        // case 2
        final int [][] grid = { {0,0,0,0},
                                {0,0,1,0},
                                {0,1,0,1},
                                {0,1,0,0} };
        success = GetPath.getPath(3,2,path, grid);
        System.out.println(success);
        if (success) System.out.println(path);
        path.clear(); }

    //Fill in your answer for this method
    public static boolean getPath (int r, int c, ArrayList<Point1> path, final int [][] grid) {
        Point1 point = new Point1(0,0);
        path.add(point);
        boolean can = false;

        // if we reach the destination, then return true
        if (point.x == r && point.y == c){
            return true;
        }

        // check if the current location is blocked or not
        else if (grid[point.x][point.y] != 1 ){
            int i = point.y;
            can = true;

            // check if the row of current column is blocked or not
            while ( grid[point.x][i] != 1 && can){

                // not blocked then check next row of the column
                if (grid[point.x][i] != 1){
                    i += 1;
                    can = true;
                }
                else{
                    can = false;
                }
            }

            // the row of current column is not blocked then move to down
            if (can){
                point.y += 1;
                getPath (r, c, path, grid);
            }

            // the row of current column is blocked then move to right
            else{
                point.x += 1;
            }
        }
        return can;
    }
}

//You do not need to change any code below ---------
class Point1 {
    int x;
    int y;

    Point1 (int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
//--------------------------------------------------

/* HINT:
Your solution ought to work with a grid that is not square.
Here is the grid for Test Case 8:

            final int[][] grid = {
                    {0,0,0,1},
                    {0,1,0,0},
                    {0,1,1,1},
                    {0,0,0,1},
                    {1,1,0,0},
                    {1,1,1,0}
            };

If the destination is r = 5, c = 3, then getPath() returns true.
If the destination is r = 2, c = 3, then getPath() returns false.

*/

