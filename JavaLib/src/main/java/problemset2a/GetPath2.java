package problemset2a;


import java.util.ArrayList;

public class GetPath2 {

    public static void main(String[] args) {

        // case 1
        final int [][] grid0 = { {0,0,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,1,0,0} };
        ArrayList<Point> path = new ArrayList<>();
        boolean success = GetPath2.getPath(3,2,path, grid0);
        System.out.println(success);
        if (success) System.out.println(path);
        path.clear();

        // case 2
        final int [][] grid = { {0,0,0,0},
                {0,0,1,0},
                {0,1,0,1},
                {0,1,0,0} };
        success = GetPath2.getPath(3,2,path, grid);
        System.out.println(success);
        if (success) System.out.println(path);
        path.clear(); }

    //Fill in your answer for this method
    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {

        // check if the destination is the same as the start then true
        if (r == 0 && c == 0){
            return true;
        }

        // the destination value is out of the grid or if the destination is blocked then false
        else if (r < 0 || c < 0 || grid[r][c] == 1){
            return false;
        }

        else if (r == 0 && c == 1 || r == 1 && c == 0){
            Point point = new Point(0, 0);
            path.add(point);
            point = new Point(r, c);
            path.add(point);
            return true;
        }

        // check if (r-1), c has path from 0,0 or r, (c-1) has path from 0,0, if have then true
        else if (getPath(r-1, c, path, grid) || getPath(r, c-1, path, grid)){
            // Add current point to path
            Point point = new Point(r, c);
            path.add(point);
            return true;
        }
        // if not then false
        else{
            return false;
        }
    }
}

//You do not need to change any code below ---------
class Point {
    int x;
    int y;

    Point (int x, int y) {
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

