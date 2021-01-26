import java.util.List;
import java.util.Stack;

public class DFS {
    public void dfsvisit(Node node) {
        Stack<Node> DFS_stack = new Stack<Node>();
        DFS_stack.push(node);
        node.setVisited(true);
        while (!DFS_stack.isEmpty()) {
            Node nodeRemove = DFS_stack.pop();
            System.out.print(nodeRemove.getVal() + " ");
 
            List<Node> adjs = nodeRemove.getAdjacenets();
            for (int i = 0; i < adjs.size(); i++) {
                Node currentNode = adjs.get(i);
                if(currentNode != null && !currentNode.isVisited()) {
                    DFS_stack.push(currentNode);
                    currentNode.setVisited(true);
                }
            }
        }
    }
    
     public static void main(String [] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node0.addAdjecents(node1);
        node1.addAdjecents(node2);
        node0.addAdjecents(node3);
        node0.addAdjecents(node4);
        node4.addAdjecents(node5);
        node4.addAdjecents(node6);
       
        DFS dfs = new DFS();
        System.out.println("DFS traversal of above graph: ");
        dfs.dfsvisit(node0);
    }
}
