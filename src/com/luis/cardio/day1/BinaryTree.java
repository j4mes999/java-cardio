package src.com.luis.cardio.day1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Class BinaryTree represents a binary tree
 * with some methods
 */
public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {

    }

    /**
     *
     * @return the string representation of the three
     * using preorder method
     */
    public String serialize(){
        return preOrder(this.root).trim();
    }


    private String preOrder(Node root){
        //Preorder root, left, right
        String s = " ";
        if(root.getLeft() != null || root.getRight() != null){
            s += String.valueOf(root.getValue());
        }else if(root.getLeft() == null && root.getRight() == null){
            s += String.valueOf(root.getValue());
        }
        if(root.getLeft() != null){
            s += preOrder(root.getLeft());
        }
        if(root.getRight() != null){
            s += preOrder(root.getRight());
        }

        return s;

    }

    /**
     * Deserialize the string into a binary tree
     * @param s the string representation e.g: "12 30 40"
     *          int values separated by space
     * @return the root of the tree with all its elements
     */
    public Node deserialize(String s){
        List<String> values =  new LinkedList<>(Arrays.asList(s.split(" ")));
        Node root = new Node(Integer.parseInt(values.remove(0)));
        while(!values.isEmpty()){
            addElement(root, Integer.parseInt(values.remove(0)));
        }
        return root;
    }

    private void addElement(Node node, Integer val) {

        if(val < node.getValue() && node.getLeft() == null){
            node.setLeft(new Node(val));
        }else if(val > node.getValue() && node.getRight() == null) {
            node.setRight(new Node(val));
        }else{
            if(val < node.getValue() && node.getLeft() != null){
                addElement(node.getLeft(),val);
            }else if (val > node.getValue() && node.getRight() != null) {
                addElement(node.getRight(), val);
            }
        }

    }

}
