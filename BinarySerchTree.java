public class BinarySerchTree{
    
    private Node root ;

    public BinarySerchTree(){
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void Insert(Node nodeToInsert) {
        if (root == null) {
            this.root = nodeToInsert;
        } else {
            if (nodeToInsert.getValue() > root.getValue()) {
                if (root.getRightNode() == null){
                    root.setRightNode(nodeToInsert);
                } else{
                    root.getRightNode().insert(nodeToInsert);
                }

            } else{
                if (root.getLefNode() == null){
                    root.setLeftNode(nodeToInsert);
                } else{
                    root.getLefNode().insert(nodeToInsert);

                }
            }
        }
    }

    public Node search(Node nodeToSeach) {
        if (nodeToSeach.getValue() == root.getValue()) {
            return root;
        } else{
            try{
            if (nodeToSeach.getValue() > root.getValue() ) {
                return root.getRightNode().search(nodeToSeach);
            } else{
                return root.getLefNode().search(nodeToSeach);
            }
            } catch(NodeNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return nodeToSeach;
    }

    
}