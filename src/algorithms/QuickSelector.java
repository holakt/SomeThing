package algorithms;

/**
 * 快速选择算法
 * quick select算法的主要目的是在一个没有排序的数组里面，找到第k小的元素。
 *
 * @author holate
 * @date 2021/5/19
 */
public class QuickSelector {

    public int select(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }

    int quickSelect(int[] arr, int from, int to, int k) {
        // 返回坐标index
        int index = partition(arr, from, to);
        //index就是第k大的元素
        if (index - from == k) {
            return arr[index];
            // index 在后半段
        } else if (index - from > k) {
            return quickSelect(arr, from, index - 1, k);
            // index 在前半段
        } else {
            return quickSelect(arr, index + 1, to, k - (index - from + 1));
        }
    }

    int partition(int[] arr, int from, int to) {
        int pivot = arr[from];
        int i = from + 1, j = to;
        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] >= pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
            }
        }
        swap(arr, from, j);
        return j;
    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}