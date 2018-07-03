package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {

        TreeNode<String> FamilyTree = new TreeNode<String> ("Lucille");
        FamilyTree.addChild("George Oscar");
        TreeNode<String> child2 = FamilyTree.addChild("Michael");
        TreeNode<String> child3 = FamilyTree.addChild("Lindsay");
        FamilyTree.addChild("Buster");

        child2.addChild("George Michael");
        child3.addChild("Maeby");



        //TODO - implement this method!

        return FamilyTree;
    }
}
