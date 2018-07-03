package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {
    }

    public TreeNode<String> createFamilyTree() {

        //root
        TreeNode<String> root = new TreeNode<String>("Lucille");
            //children
            TreeNode<String> node0 = root.addChild ("George Oscar");
            TreeNode<String> node1 = root.addChild ("Michael");
            TreeNode<String> node2 = root.addChild ("Lindsay");
            TreeNode<String> node3 = root.addChild ("Buster");
                //grandchildren
                TreeNode<String> node10 = node1.addChild ("George Michael");
                TreeNode<String> node20 = node2.addChild ("Maeby");

        return root;
    }
}

//07.02.18 Coding Fin ><(((('>