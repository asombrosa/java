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

Time complexity : O(m * n + m * n) => O(m * n)
Space complexity : O(m * n)

 */
public class TabulizedGridTraveller {
    BigInteger gridTraveller(int row, int column) {
        BigInteger[][] array = new BigInteger[row + 1][column + 1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= column; j++) {
                array[i][j] = BigInteger.ZERO;
            }
        }
        array[1][1] = BigInteger.ONE;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= column; j++) {
                if (j < column) {
                    array[i][j + 1] = array[i][j + 1].add(array[i][j]);
                }
                if (i < row) {
                    array[i + 1][j] = array[i + 1][j].add(array[i][j]);
                }
            }
        }
        return array[row][column];
    }

    public static void main(String[] args) {
        TabulizedGridTraveller gridTraveller = new TabulizedGridTraveller();
        System.out.println(gridTraveller.gridTraveller(1, 1));
        System.out.println(gridTraveller.gridTraveller(3, 2));
        System.out.println(gridTraveller.gridTraveller(2, 3));
        System.out.println(gridTraveller.gridTraveller(3, 3));
        System.out.println(gridTraveller.gridTraveller(18, 18));
    }
}
