package binarytree;

public class Main {
    public static void main(String[] args) {
        TreeNode1 drinks = new TreeNode1("Drinks");
        TreeNode1 hot = new TreeNode1("Hot");
        TreeNode1 cold = new TreeNode1("Cold");
        TreeNode1 tea = new TreeNode1("Tea");
        TreeNode1 Coffee = new TreeNode1("Coffee");
        TreeNode1 wine = new TreeNode1("Wine");
        TreeNode1 beer = new TreeNode1("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(Coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));

    }
}
