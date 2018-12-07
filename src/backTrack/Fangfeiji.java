package backTrack;

/**
 * 1113: 小明放飞机
 * 时间限制: 1 Sec  内存限制: 128 MB
 * 提交: 34  解决: 16
 * [提交][状态][讨论版][命题人:liangxingjian]
 * 题目描述
 * 小明买了一架玩具直升飞机。通过遥控可以控制直升飞机上升或下降。
 * 当小明按上升按钮的时候，飞机可以上升为原来高度的两倍。
 * 当小明按下降按钮时，飞机高度可以下降1米。
 * 假设当前飞机高度为2米，之后他一共按了8次上升按钮、12次下降按钮，飞机就稳稳的降落在地上（已知最后一次按的是下降按钮）。
 * 请你计算小明按按钮的合理次序共有多少种（举例，如“-++---+-+-+-+-++----”为合理次序，假设“-”为下降，“+”为上升）。
 * <p>
 * <p>
 * 输入
 * 无。
 * 输出
 * 输出两个数字，中间用空格隔开，格式为：
 * XX YY
 * 其中：XX为按了8次上升按钮、12次下降按钮的合理次序个数；
 * YY为按了10次上升按钮、20次下降按钮的合理次序个数；
 * 提示
 * 递归 回溯
 * <p>
 * 来源http://119.23.214.227/problem.php?id=1113
 */
public class Fangfeiji {
    static int sum;
    public static void main(String[] args) {
        int up = 8;
        int down = 10;
        int height = 2;
        play(up, down, height);
        System.out.print(sum + " ");
        sum = 0;
        up = 10;
        down = 18;
        height = 2;
        play(up, down, height);
        System.out.println(sum);
    }

    private static void play(int up, int down, int height) {
        if (height - down > 2 || up - down > 1 || height ==0) {
            return;
        }
        if (up > 0) {
            play(up - 1, down, height * 2);
        }
        if (down > 0) {
            play(up, down - 1, height - 1);
        }
        if (up == 0 && down == 0 && height == 2) {
            sum++;
            return;
        }
    }
}