package leetcodecn;

/**
 * 数据结构
 */
/*
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/



public class Solution133 {
    /*
    Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (node.neighbors.size() == 0) {
            return new Node(node.val);
        }
        return cloneGraph2(node);
    }

    public Node cloneGraph2(Node node) {
        Node n = new Node(node.val);
        n.neighbors = new ArrayList<>(node.neighbors.size());
        map.put(n.val, n);
        for (Node neighbor : node.neighbors) {
            if (map.containsKey(neighbor.val)) {
                n.neighbors.add (map.get(neighbor.val));
            } else {
                n.neighbors.add(cloneGraph2(neighbor));
            }
        }
        return n;
    }

//    public static void main(String[] args) {
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        n1.neighbors = new ArrayList<>(Arrays.asList(n2, n4));
//        n2.neighbors = new ArrayList<>(Arrays.asList(n1, n3));
//        n3.neighbors = new ArrayList<>(Arrays.asList(n2, n4));
//        n4.neighbors = new ArrayList<>(Arrays.asList(n1, n3));
//
//        new Solution133().cloneGraph(n1);
//    }
*/
}

/*
给你无向连通图中一个节点的引用，请你返回该图的深拷贝（克隆）。

图中的每个节点都包含它的值 val（int） 和其邻居的列表（list[Node]）。

class Node {
    public int val;
    public List<Node> neighbors;
}


测试用例格式：

简单起见，每个节点的值都和它的索引相同。例如，第一个节点值为 1（val = 1），第二个节点值为 2（val = 2），以此类推。该图在测试用例中使用邻接列表表示。

邻接列表 是用于表示有限图的无序列表的集合。每个列表都描述了图中节点的邻居集。

给定节点将始终是图中的第一个节点（值为 1）。你必须将给定节点的拷贝作为对克隆图的引用返回。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/clone-graph
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */