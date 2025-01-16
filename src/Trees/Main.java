import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        // BST tree=new BST();
        // int[]nums={1,5,3,2,6};
        // tree.populate(nums);
        // tree.display();
    
    practise tree=new practise();
    tree.populate(scanner);
    tree.prettyDisplay();
    }
}
