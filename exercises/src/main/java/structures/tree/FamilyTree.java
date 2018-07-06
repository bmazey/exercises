package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {


        TreeNode <String> Grandma = new TreeNode<>("Lucille");
        TreeNode <String> GeorgeOscar = Grandma.addChild("George Oscar");
        TreeNode <String> Michael = Grandma.addChild("Michael");
        TreeNode <String> Lindsay = Grandma.addChild("Lindsay");
        TreeNode <String> Buster = Grandma.addChild("Buster");
        TreeNode <String> GeorgeMichael = Michael.addChild("George Michael");
        TreeNode <String> Maeby = Lindsay.addChild("Maeby");

        return Grandma;
    }
}
