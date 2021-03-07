package dp.gridTraveller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*
Time complexity : O(m + n)
Space complexity : O(m + n)
 */
public class GridTravellerMemoizedCode {
    Map<String, BigInteger> map = new HashMap<>();

    BigInteger gridTraveller(int row, int column) {
        String key = row + "," + column;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if(row == 0 || column == 0) {
            return BigInteger.ZERO;
        }
        if(row == 1 && column == 1) {
            return BigInteger.ONE;
        }
        map.put(key, gridTraveller(row - 1, column).add(gridTraveller(row, column - 1)));
        return map.get(key);
    }

    public static void main(String[] args) {
        GridTravellerMemoizedCode gridTraveller = new GridTravellerMemoizedCode();
        System.out.println(gridTraveller.gridTraveller(1, 1));
        System.out.println(gridTraveller.gridTraveller(3, 2));
        System.out.println(gridTraveller.gridTraveller(2, 3));
        System.out.println(gridTraveller.gridTraveller(3, 3));
        System.out.println(gridTraveller.gridTraveller(18, 18));
    }
}
