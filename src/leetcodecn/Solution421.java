package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution421 {
/*    public static void main(String[] args) {
        int ret = new Solution421().findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8});
        System.out.println(ret);
    }

    public int findMaximumXOR(int[] nums) {
        int ret = 0;
        Trie root = new Trie();
        for (int num : nums) {
            Trie cur = root;
            for (int i = 31; i >= 0; i--) {
                if (((num >> i) & 1) == 1) {
                    if (cur.right == null)
                        cur.right = new Trie();
                    cur = cur.right;
                } else {
                    if (cur.left == null)
                        cur.left = new Trie();
                    cur = cur.left;
                }
            }
        }
        for (int num : nums) {
            Trie cur = root;
            int pair = 0;
            for (int i = 31; i >= 0; i--) {
                if (((num >> i) & 1) == 1) {
                    if (cur.left != null) {
                        cur = cur.left;
                    } else {
                        cur = cur.right;
                        pair |= (1 << i);
                    }
                } else {
                    if (cur.right != null) {
                        cur = cur.right;
                        pair |= (1 << i);
                    } else {
                        cur = cur.left;
                    }
                }
            }
            ret = Math.max(ret, num ^ pair);
        }
        return ret;
    }

    private void DFS(Trie node, StringBuilder builder) {
        if (node.left == null && node.right == null) {
            System.out.println(builder);
        }
        if (node.left != null) {
            builder.append(0);
            DFS(node.left, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (node.right != null) {
            builder.append(1);
            DFS(node.right, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }*/
}

/*
class Trie {
    Trie left;
    Trie right;
}
*/
