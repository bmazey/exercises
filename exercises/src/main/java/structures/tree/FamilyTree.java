package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {

        TreeNode<String> root = new TreeNode<String>("Lucille");
        TreeNode<String> child1 = root.addChild("George Oscar");
        TreeNode<String> child2 = root.addChild("Michael");
        TreeNode<String> child3 = root.addChild("Lindsay");
        TreeNode<String> child4 = root.addChild("Buster");
        TreeNode<String> grandchild1 = child2.addChild("George Michael");
        TreeNode<String> grandchild2 = child3.addChild("Maeby");

        return root;
    }
}
