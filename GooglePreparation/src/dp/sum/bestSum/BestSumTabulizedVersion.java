package dp.sum.bestSum;

import java.util.ArrayList;
import java.util.List;

/*
[5,3,4,7] : target sum : 7
output : (3 + 4) or (7)
    0     1      2      3      4      5      6      7
| null | null | null | null | null | null | null | null |

    0     1      2      3      4      5      6      7
| [  ] | null | null | null | null | null | null | null |

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | null | [7] |  => CHANGE VALUES WHEN CURRENT VALUE IS not null
  |................5................|
  |..........3..........|
  |.............4.............|
  |......................7.......................|

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | null | [7] |  => DO NOTHING WHEN CURRENT VALUE IS null
          |................5................|
          |..........3........|
          |............4............|
          |......................7.......................|

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | null | [7] |  => DO NOTHING WHEN CURRENT VALUE IS null
                |................5................|
                |..........3........|
                |............4............|
                |......................7.......................|

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | [3, 3] | [7] |  => CHANGE VALUES WHEN CURRENT VALUE IS not null
                        |.................5.................|       and if length of current is less than
                        |..........3........|                        what's already populated
                        |.............4.............|
                        |......................7.......................|

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | [3, 3] | [7] |  => CHANGE VALUES WHEN CURRENT VALUE IS not null
                              |.................5.................|     and if length of current is less than
                              |...........3.........|                       what's already populated
                              |...............4..............|
                              |......................7.......................|

Time complexity : O(n * m)
Space complexity : O(m)
 */
public class BestSumTabulizedVersion {

    public List<Integer> bestSum(int targetSum, Integer[] numbers) {
        List<Integer>[] array = new ArrayList[targetSum + 1];
        array[0] = new ArrayList<>();
        for (int i = 0; i <= targetSum; i++) {
            for (Integer num : numbers) {
                if (i + num <= targetSum && array[i] != null &&
                (array[i + num] == null || array[i].size() < array[i + num].size())) {
                    List<Integer> temp = new ArrayList<>(array[i]);
                    temp.add(num);
                    array[i + num] = temp;
                }
            }
        }
        return array[targetSum];
    }

    public static void main(String[] args) {
        BestSumTabulizedVersion bestSumTabulizedVersion = new BestSumTabulizedVersion();
        System.out.println(bestSumTabulizedVersion.bestSum(7, new Integer[]{5, 3, 4, 7})); // [7]
        System.out.println(bestSumTabulizedVersion.bestSum(8, new Integer[]{2, 3, 5})); // [3, 5]
        System.out.println(bestSumTabulizedVersion.bestSum(8, new Integer[]{1, 4, 5})); // [4, 4]
        System.out.println(bestSumTabulizedVersion.bestSum(100, new Integer[]{1, 2, 25})); // [25, 25, 25, 25]
        System.out.println(bestSumTabulizedVersion.bestSum(300, new Integer[]{7, 14})); // null
    }
}
