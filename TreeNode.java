import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Object childData) {
        TreeNode chilNode = new TreeNode(childData);
        this.children.add(chilNode);
    }

    public void addChild(TreeNode childNode) {
        this.children.add(childNode);
    }

    public void removeChild(TreeNode childNode) {
        if(this.children.isEmpty()) {
            return;
        }

        if(this.children.contains(childNode)) {
            this.children.remove(childNode);
        } else {
            for(TreeNode node : this.children) {
                node.removeChild(childNode);
            }
        }
    }

    public void removeChild(Object childData) {
        if(this.children.isEmpty()) {
            return;
        }

        for(TreeNode node : this.children) {
            if(node.data.equals(childData)) {
                this.children.remove(node);
                return;
            } else {
                node.removeChild(childData);
            }
        }
    }

    public static void main(String[] args) {

    }
}
