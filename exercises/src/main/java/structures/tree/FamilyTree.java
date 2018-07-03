package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {
        TreeNode<String> Root = new TreeNode<String>("Lucille");
        Root.addChild("George Oscar");
        TreeNode<String> child2 = Root.addChild("Michael");
        TreeNode<String> child3 = Root.addChild("Lindsay");
        Root.addChild("Buster");

        child2.addChild("George Michael");
        child3.addChild("Maeby");






        //TODO - implement this method!

        return Root;
    }
}
