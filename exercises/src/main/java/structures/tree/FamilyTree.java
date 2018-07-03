package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {

        TreeNode<String> NewNode = new TreeNode<String>("Lucille");

        NewNode.addChild("George Oscar");
        TreeNode<String> child2 = NewNode.addChild("Michael");
        TreeNode<String> child3 = NewNode.addChild("Lindsay");
        NewNode.addChild("Buster");

        child2.addChild("George Michael");

       child3.addChild("Maeby");





        //TODO - implement this method!

        return NewNode;
    }
}
