package dp.gridTraveller;

import java.math.BigInteger;

/*
Given a 2D grid of dimensions m*n,
we need to go from top - left to bottom right
the only way to move is right or down
.......
|S| | |
.......
| | |E|
.......

for a 2 * 3 grid, we have only 3 ways to move:
1.  right, right, down
2.  right, down, right
3.  down, right, right

grid which contains either 0 rows or 0 columns is invalid. Hence returns 0
gridTraveller(1,1) -> 1

gridTraveller(2, 3) ->

              2  ,  3
    down /              \ right
       1,3               2,2
 down/    \ r       d  /     \ r
  0,3     1,2        1,2       2,1
       d/    \r    d/  \r   d/   \r
       0,2   1,1  0,2  1,1  1,1  2,0

Time complexity : O(2 ^ (m+n))
Space complexity : O(m+n)

 */
public class GridTraveller {
    BigInteger gridTraveller(int row, int column) {
        if (row == 0 || column == 0) {
            return BigInteger.ZERO;
        }
        if (row == 1 && column == 1) {
            return BigInteger.ONE;
        }
        return gridTraveller(row - 1, column).and(gridTraveller(row, column - 1));
    }

    public static void main(String[] args) {
        GridTraveller gridTraveller = new GridTraveller();
        System.out.println(gridTraveller.gridTraveller(2, 3));
        System.out.println(gridTraveller.gridTraveller(3, 3));
        System.out.println(gridTraveller.gridTraveller(18, 18));
    }
}
