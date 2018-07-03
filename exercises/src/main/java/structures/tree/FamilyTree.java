package structures.tree;

import apple.laf.JRSUIUtils;
import sun.jvm.hotspot.opto.RootNode;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {

        //TODO - implement this method!
    TreeNode<String> rootNode = new TreeNode<String>("Lucille");

    TreeNode<String> child1 = rootNode.addChild("George Oscar");
    TreeNode<String> child2 = rootNode.addChild("Michael");
    TreeNode<String> child3 = rootNode.addChild("Lindsay");
    TreeNode<String> child4 = rootNode.addChild("Buster");

    TreeNode<String> grandchild1 = child2.addChild("George Michael");
    TreeNode<String> grandchild2 = child3.addChild("Maeby");




        return rootNode;
    }
}
