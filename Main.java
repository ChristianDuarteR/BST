
public class Main {
    public static void main(String [] args) {
        BinarySerchTree binarySerchTree = new BinarySerchTree();
        binarySerchTree.Insert(new Node(7));
        binarySerchTree.Insert(new Node(1));
        binarySerchTree.Insert(new Node(-3));
        binarySerchTree.Insert(new Node(2));
        binarySerchTree.Insert(new Node(10));
        binarySerchTree.Insert(new Node(-5));
        binarySerchTree.Insert(new Node(3));
        binarySerchTree.Insert(new Node(0));
        
        //Pruebas

        Node.printNode(binarySerchTree.getRoot());
        System.out.println(binarySerchTree.search(new Node(10)));

        }
}
