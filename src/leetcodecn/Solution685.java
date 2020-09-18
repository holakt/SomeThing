package leetcodecn;

/*
在本问题中，有根树指满足以下条件的有向图。该树只有一个根节点，所有其他节点都是该根节点的后继。每一个节点只有一个父节点，除了根节点没有父节点。

输入一个有向图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。

结果图是一个以边组成的二维数组。 每一个边 的元素是一对 [u, v]，用以表示有向图中连接顶点 u 和顶点 v 的边，其中 u 是 v 的一个父节点。

返回一条能删除的边，使得剩下的图是有N个节点的有根树。若有多个答案，返回最后出现在给定二维数组的答案。

示例1:

输入: [[1,2], [1,3], [2,3]]
输出: [2,3]
解释: 给定的有向图如下:
  1
 / \
v   v
2-->3
示例 2:

输入: [[1,2], [2,3], [3,4], [4,1], [1,5]]
输出: [4,1]
解释: 给定的有向图如下:
5 <- 1 -> 2
     ^    |
     |    v
     4 <- 3
注意:

二维数组大小的在3到1000范围内。
二维数组中的每个整数在1到N之间，其中 N 是二维数组的大小。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/redundant-connection-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution685 {/*
    public static void main(String[] args) {
        int[][] edges =
//            {{2, 1}, {3, 1}, {4, 2}, {1, 4}};
            {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}};
        int[] x = new Solution685().findRedundantDirectedConnection(edges);
        System.out.println(x[0] + "," + x[1]);
    }
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int nodesCount = edges.length;
        UnionFind uf = new UnionFind(nodesCount + 1);
        int[] parent = new int[nodesCount + 1];
        for (int i = 1; i <= nodesCount; ++i) {
            parent[i] = i;
        }
        int conflict = -1;
        int cycle = -1;
        for (int i = 0; i < nodesCount; ++i) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (parent[node2] != node2) {
                conflict = i;
            } else {
                parent[node2] = node1;
                if (uf.find(node1) == uf.find(node2)) {
                    cycle = i;
                } else {
                    uf.union(node1, node2);
                }
            }
        }
        if (conflict < 0) {
            int[] redundant = {edges[cycle][0], edges[cycle][1]};
            return redundant;
        } else {
            int[] conflictEdge = edges[conflict];
            if (cycle >= 0) {
                int[] redundant = {parent[conflictEdge[1]], conflictEdge[1]};
                return redundant;
            } else {
                int[] redundant = {conflictEdge[0], conflictEdge[1]};
                return redundant;
            }
        }
    }
}

class UnionFind {
    int[] ancestor;

    //初始化根节点
    public UnionFind(int n) {
        ancestor = new int[n];
        for (int i = 0; i < n; ++i) {
            ancestor[i] = i;
        }
    }

    //把index1的根节点更新为index2的根节点
    public void union(int index1, int index2) {
        ancestor[find(index1)] = find(index2);
    }

    //递归查找根节点
    public int find(int index) {
        //如果存在根节点则递归查找
        if (ancestor[index] != index) {
            ancestor[index] = find(ancestor[index]);
        }
        return ancestor[index];
    }*/
}

/*
    错误答案1
    输入：
    [[2,1],[3,1],[4,2],[1,4]]
    输出：
    [3,1]
    预期结果：
    [2,1]
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[][] nums = new int[n+1][3];
        for (int i = 0; i < edges.length; i++) {
            int num = nums[edges[i][1]][2];
            if (num == 0) {
                int i1 = nums[edges[i][0]][0];
                if (i1 == edges[i][1]) {
                    return edges[i];
                }
                nums[edges[i][1]][0] = i1 == 0 ? edges[i][0] : i1;
                nums[edges[i][1]][1] = edges[i][0];
                nums[edges[i][1]][2] = edges[i][1];
            } else {
                return edges[i];
            }
        }
        return null;
    }

    思路：判断后面进入的数字是否为导致冲突(两个父节点)或导致环路，如果是则return

    错误原因：后进入的边确实导致冲突，但是先进入的边可能在之后产生环路。如果移除当前冲突的边，导致之后环路扔存在
*/
/*
    正确答案1：

    执行用时：14 ms, 在所有 Java 提交中击败了7.81%的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了34.27%的用户
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[][] nums = new int[n + 1][3];
        //fixme 可以只存edges的下标，节省空间
        int[] conflict = new int[2];
        int[] loop = new int[2];
        for (int i = 0; i < edges.length; i++) {
            int num = nums[edges[i][1]][2];
            if (num == 0) {
                int i1 = nums[edges[i][0]][0];
                //有环路
                if (i1 == edges[i][1]) {
                    loop = edges[i];
                } else {
                    nums[edges[i][1]][0] = i1 == 0 ? edges[i][0] : i1;
                    //fixme 循环遍历降低效率
                    for (int k = 0; k < nums.length; k++) {
                        if (nums[k][0] == edges[i][1]) nums[k][0] = nums[edges[i][1]][0];
                    }
                    nums[edges[i][1]][1] = edges[i][0];
                    nums[edges[i][1]][2] = edges[i][1];
                }
                //有冲突
            } else {
                conflict = edges[i];
            }
        }
        if (loop[0] != 0) {
            if (conflict[0] == 0) {
                conflict = loop;
            } else {
                conflict[0] = nums[conflict[1]][1];
            }
        }
        return conflict;
    }
 */
