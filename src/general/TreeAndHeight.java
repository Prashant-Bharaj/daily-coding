package general;

class Node {
    int val;
    Node left;
    Node right;


    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeAndHeight {
    static int height(Node node){
        if(node == null) return 0;
        int x = height(node.left);
        int y = height(node.right);
        return x > y ? x+1 : y+1;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        a.left = b;
        b.right = c;
        System.out.println(height(a));
    }
}
