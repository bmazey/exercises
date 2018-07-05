package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {
        TreeNode<String> Lucille=new TreeNode<String>("Lucille");
        TreeNode<String> child1=Lucille.addChild("George Oscar");
        TreeNode<String> child2=Lucille.addChild("Michael");
        TreeNode<String> child3=Lucille.addChild("Lindsay");
        TreeNode<String> child4=Lucille.addChild("Buster");


        TreeNode<String> grandchild1=child2.addChild("George Michael");
        TreeNode<String> grandchild2=child3.addChild("Maeby");



        return Lucille;
    }
}
