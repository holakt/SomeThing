package coding_interviews;

public class ci_01 {
    public boolean Find(int target, int[][] array) {
        int h = array.length;
        for (int i = 0; i < h; i++) {
            int w = array[i].length;
            if (w == 0) {
                continue;
            }
            if (target >= array[i][0] && target <= array[i][w - 1]) {
                for (int j = 0; j < w; j++) {
                    if (target == array[i][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
