package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {
         TreeNode<String> root = new TreeNode<String>("Lucille");

         TreeNode<String> firstchild = root.addChild("George Oscar");
         TreeNode<String> secondchild = root.addChild("Michael");
         TreeNode<String> thirdchild = root.addChild("Lindsay");
         TreeNode<String> forthchild = root.addChild("Buster");

         TreeNode<String> firstgrand = secondchild.addChild("George Michael");
         TreeNode<String> secondgrand = thirdchild.addChild("Maeby");

        //TODO - implement this method!

        return root;
    }
}
