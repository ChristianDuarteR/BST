public class Node{

    private Node Left;

    private Node right;

    private Integer value;

    public Node(Integer value) {
        this.value = value;
        this.Left = null;
        this.right = null;
    }

    public Node getLefNode(){
        return Left;
    }

    public Node getRightNode(){
        return right;
    }

    public Integer getValue(){
        return value;
    }

    public void setLeftNode(Node left){
        this.Left = left;
    }

    public void setRightNode(Node right) {
        this.right = right;
    }

    public static void printNode(Node node){
        if (node != null){
        System.out.println(node.value + " " );
        printNode(node.Left );
        printNode(node.right);
        }
    }

    public void insert(Node nodeToInsert) {

        if (nodeToInsert.value > value) {
            if (right == null){
              right = nodeToInsert;
            } else{
                right.insert(nodeToInsert);
            }
        } else {
            if (Left == null) {
               Left = nodeToInsert;
            } else{
                Left.insert(nodeToInsert);
            }
        }
    }

    public Node search(Node nodeToSeach) throws NodeNotFoundException{
       if (nodeToSeach.getValue() == value) {
          return this;
       } else{
          Node node;
          if (nodeToSeach.getValue() > value) {
            node = right.search(nodeToSeach);
            if (node == null) throw new NodeNotFoundException();
            else{
                return node;
            }
        } else{

            node = Left.search(nodeToSeach);
            if (node == null) throw new NodeNotFoundException();
            else{
                return node;          
            }
       }
    }
}

@Override
public String toString() {
   return "Node value: " + value + 
   "\nNode Left: " + Left + 
   "\nNode Right: "  + right;
}
} 