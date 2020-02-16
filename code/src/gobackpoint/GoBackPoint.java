package gobackpoint;

/**
 * 657. 机器人能否返回原点
 *
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 *
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/robot-return-to-origin
 * @author yingfeng
 */
public class GoBackPoint {

    /**
     * 此写法会忽略非法字符，仅对输入的RLUD起反应
     * @param moves RLUD
     * @return Boolean
     */
    public boolean judgeCircle(String moves) {
        int[] count = {0, 0};
        for (char c : moves.toCharArray()){
            if(c == 'R'){count[0]++;}
            else if(c == 'L'){count[0]--;}
            else if(c == 'U'){count[1]++;}
            else if(c == 'D'){count[1]--;}
        }
        return count[0] == 0 && count[1] == 0;
    }

    /**
     * 当输入 0 > ascii && ascii <= 22 的字符会报错.leecode的测试用例没有覆盖到输入非法字符
     * @param moves RLUD
     * @return Boolean
     */
    public boolean judgeCircle1(String moves) {
        int[] count = new int[22];
        for(char c : moves.toCharArray()){
            count[c - 'A']++;
        }
        return count['U'-'A'] == count['D'-'A'] && count['L'-'A'] == count['R'-'A'];
    }

    public static void main(String[] args){
        GoBackPoint gbp = new GoBackPoint();
        System.out.println(gbp.judgeCircle1("RLUDUDUD"));
    }

}
