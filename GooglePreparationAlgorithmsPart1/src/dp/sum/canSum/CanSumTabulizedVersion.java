package dp.sum.canSum;

/*
Get target sum using some numbers of the array.
Return boolean if possible
[5,3,4,7] : target sum : 7
output : yes (3 + 4) (7)
  0   1   2   3   4   5   6   7
| F | F | F | F | F | F | F | F |

  0   1   2   3   4   5   6   7
| T | F | F | F | F | F | F | F |

  0   1   2   3   4   5   6   7
| T | F | F | T | T | T | F | T |   => CHANGE VALUES TO TRUE WHEN CURRENT VALUE IS TRUE
  |.........5.........|
  |.....3.....|
  |.......4.......|
  |.............7.............|

  0   1   2   3   4   5   6   7
| T | F | F | T | T | T | F | T |   => DO NOTHING WHEN CURRENT VALUE IS FALSE
      |.........5.........|
      |.....3.....|
      |.......4.......|
      |.............7.............|

  0   1   2   3   4   5   6   7
| T | F | F | T | T | T | F | T |   => DO NOTHING WHEN CURRENT VALUE IS FALSE
          |.........5.........|
          |.....3.....|
          |.......4.......|
          |.............7.............|

  0   1   2   3   4   5   6   7
| T | F | F | T | T | T | T | T |   => CHANGE VALUES TO TRUE WHEN CURRENT VALUE IS TRUE
              |.........5.........|
              |.....3.....|
              |.......4.......|
              |.............7.............|

  0   1   2   3   4   5   6   7
| T | F | F | T | T | T | F | T |   => CHANGE VALUES TO TRUE WHEN CURRENT VALUE IS TRUE
                  |.........5.........|
                  |.....3.....|
                  |.......4.......|
                  |.............7.............|

Note : all numbers are positive
       We can use numbers in array any number of times

Time complexity : O(n * m)
Space complexity : O(m)
 */
public class CanSumTabulizedVersion {
    public boolean canSum(int targetSum, Integer[] numbers) {
        boolean[] array = new boolean[targetSum + 1];
        array[0] = true;
        for (int i = 0; i <= targetSum; i++) {
            for (int num : numbers) {
                if (array[i] && i + num <= targetSum) {
                    array[i + num] = array[i];
                }
            }
        }
        return array[targetSum];
    }

    public static void main(String[] args) {
        CanSumTabulizedVersion canSum = new CanSumTabulizedVersion();
        System.out.println(canSum.canSum(7, new Integer[]{2, 3}));
        System.out.println(canSum.canSum(7, new Integer[]{5, 3, 4, 7}));
        System.out.println(canSum.canSum(7, new Integer[]{2, 4}));
        System.out.println(canSum.canSum(7, new Integer[]{2, 3, 5}));
        System.out.println(canSum.canSum(300, new Integer[]{7, 14}));
    }
}
