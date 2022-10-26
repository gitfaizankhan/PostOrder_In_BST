public class PostOrder_BST {
    Node root;
    PostOrder_BST(){
        root = null;
    }

    public static void main(String[] args) {
        PostOrder_BST tree = new PostOrder_BST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("PostOrder Traversal in BST: ");
        tree.postOrder();
    }
    void postOrder(){
        postOrderBST(root);
    }

    void postOrderBST(Node node){
        if(node == null){
            return;
        }

        postOrderBST(node.left);
        postOrderBST(node.right);
        System.out.print(node.key+" ");
    }
}
class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = null;
        right = null;
    }
}