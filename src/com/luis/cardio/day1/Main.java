package src.com.luis.cardio.day1;

public class Main {

    public static void main(String[] args) {

        //Creating the root:
        Node root = new Node(40, new Node(30), new Node(50));

        //Adding children
        root.getLeft().setLeft(new Node(20));
        root.getLeft().setRight(new Node(35));
        root.getLeft().getRight().setLeft(new Node(34));
        root.getLeft().getRight().setRight(new Node(36));
        root.getRight().setLeft(new Node(45));
        root.getRight().setRight(new Node(55));
        BinaryTree tree = new BinaryTree(root);
        System.out.println("Serialized tree 1 -> " + tree.serialize());

        //Testing the deserialize method
        BinaryTree tree2 = new BinaryTree();
        tree2.setRoot(tree2.deserialize("100 101 103 105 106 9"));
        System.out.println("Deserialized tree 2 --> " + tree2.serialize());

    }
}
