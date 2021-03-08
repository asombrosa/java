package dp.sum.howSum;

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
| [  ] | null | null | [3] | [4] | [5] | [3, 3] | [3, 4] |  => CHANGE VALUES WHEN CURRENT VALUE IS not null
                        |.................5.................|
                        |..........3........|
                        |.............4.............|
                        |......................7.......................|

    0     1      2      3      4      5      6      7
| [  ] | null | null | [3] | [4] | [5] | [3, 3] | [4, 3] |  => CHANGE VALUES WHEN CURRENT VALUE IS not null
                              |.................5.................|
                              |...........3.........|
                              |...............4..............|
                              |......................7.......................|

Time complexity : O(n * m)
Space complexity : O(m)
 */
public class HowSumTabulizedVersion {

    public List<Integer> howSum(int targetSum, Integer[] numbers) {
        List<Integer>[] array = new ArrayList[targetSum + 1];
        array[0] = new ArrayList<>();
        for (int i = 0; i <= targetSum; i++) {
            for (Integer num : numbers) {
                if (i + num <= targetSum && array[i] != null) {
                    List<Integer> temp = new ArrayList<>(array[i]);
                    temp.add(num);
                    array[i + num] = temp;
                }
            }
        }
        return array[targetSum];
    }

    public static void main(String[] args) {
        HowSumTabulizedVersion howSum = new HowSumTabulizedVersion();
        System.out.println(howSum.howSum(7, new Integer[]{2, 3}));
        howSum = new HowSumTabulizedVersion();
        System.out.println(howSum.howSum(7, new Integer[]{5, 3, 4, 7}));
        howSum = new HowSumTabulizedVersion();
        System.out.println(howSum.howSum(7, new Integer[]{2, 4}));
        howSum = new HowSumTabulizedVersion();
        System.out.println(howSum.howSum(8, new Integer[]{2, 3, 5}));
        howSum = new HowSumTabulizedVersion();
        System.out.println(howSum.howSum(300, new Integer[]{7, 14}));
    }
}
