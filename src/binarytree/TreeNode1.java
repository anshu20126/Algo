package binarytree;
import java.util.ArrayList;
public class TreeNode1 {
    String data;
    ArrayList<TreeNode1> children;
    public TreeNode1(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode1>();
    }
    public void addChild(TreeNode1 node) {
        this.children.add(node);
    }

    public String print(int level) {
        String ret;
        ret = "  ".repeat(level)+data+"\n";
        for (TreeNode1 node : this.children) {
            ret += node.print(level+1);
        }
        return ret;
    }
}

