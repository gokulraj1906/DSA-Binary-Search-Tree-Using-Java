// import java.util.LinkedList;
// import java.util.*;
// class Main{
//    public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     String a=sc.nextLine();

//        LinkedList<String>colors=new LinkedList<String>();
//        colors.add("yellow");
//        colors.add("green");
//        colors.add("black");
//         int i,flag=0;
       
//        for(i=0;i<colors.size();i++){
//         if(colors.get(i)==a){
//           flag=1;
//           break;
//        }
//           }
//           if(flag==1)
//             System.out.println("Exist");
//         else 
//            System.out.println("Does not exist");

//     }
// }

import java.util.*;
class TreeNode{
   int value;
   TreeNode left,right;
   TreeNode(int value){
      this.value=value;
      left=right=null;
   }
}
public class TreeTraversal {
   public void preorder(TreeNode node){
      if(node==null)
      return;
      System.out.print(node.value+" ");
      preorder(node.left);
      preorder(node.right);
   }
   public void inorder(TreeNode node){
      if(node==null)
      return;
      
      inorder(node.left);
      System.out.print(node.value+" ");
      inorder(node.right);
   }
   public void postorder(TreeNode node){
      if(node==null)
      return;
     
      postorder(node.left);
      postorder(node.right);
      System.out.print(node.value+" ");
   }
   public static void main(String[] args){
      TreeNode root=new TreeNode(1);
      root.left=new TreeNode(2);
      root.right=new TreeNode(3);
      root.left.left=new TreeNode(4);
      root.left.right=new TreeNode(5);
      root.left.right.left=new TreeNode(8);
      root.right.left=new TreeNode(6);
      root.right.right=new TreeNode(7);
      root.right.right.right=new TreeNode(10);
      TreeTraversal tree=new TreeTraversal();
      
      System.out.print("Preorder Traversal: ");
      tree.preorder(root);
      System.out.println();
      System.out.print("Inorder Traversal: ");
      tree.inorder(root);
      System.out.println();
      System.out.print("Postorder Traversal: ");
      tree.postorder(root);
   }
}