package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {
        TreeNode<String> root = new TreeNode<String>("Lucille"); // The parent
        TreeNode<String> FirstChild = root.addChild ("George Oscar");
        TreeNode<String> SecondChild = root.addChild ("Michael");
        TreeNode<String> ThirdChild = root.addChild ("Lindsay");
        TreeNode<String> FourthChild = root.addChild ("Buster");

        TreeNode<String> Grandson = SecondChild.addChild ("George Michael");
        TreeNode<String> Granddaughter = ThirdChild.addChild ("Maeby");

        return root;
    }
}
