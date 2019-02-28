package Tree;

import java.util.Scanner;

public class BinaryTree {
	private static int m=0;
	private static int n=0;
	public static Scanner read=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("按照线序遍历的方式创建一个二叉树先：");
		Node root=new Node();
		preOrderCreateBinaryTree(root);
		System.out.println("线序遍历差二叉树：");
		preOrderReserch(root);
		Node copiedNode=new Node();
		System.out.println();
		copiedNode=copyBinaryTree(root, copiedNode);
		System.out.println("先序遍历被复制的二叉树：");
		preOrderReserch(copiedNode);
		System.out.println("这棵树的深度是：");
		System.out.println(depth(root));
	}
	public static void preOrderCreateBinaryTree(Node node){//先序创建一个二叉树
		System.out.print("读入一个数据：");
		int content=read.nextInt();
		if (content==0) {
			node=null;
		}
		else {
			node.left=new Node();
			node.right=new Node();
			node.content=content;
			preOrderCreateBinaryTree(node.left);
			preOrderCreateBinaryTree(node.right);
		}
	}
	public static void preOrderReserch(Node node){//先序遍历二叉树
		if (node!=null) {
			System.out.print(node.content+" ");
		}
		if (node.left!=null) {
			preOrderReserch(node.left);
		}
		if(node.right!=null){
			preOrderReserch(node.right);
		}
	}
	public static Node copyBinaryTree(Node node,Node copiedNode){//复制二叉树
		copiedNode.content=node.content;
		if (node.left!=null) {
			copiedNode.left=new Node();
			copyBinaryTree(node.left,copiedNode.left);
		}
		if(node.right!=null){
			copiedNode.right=new Node();
			copyBinaryTree(node.right,copiedNode.right);
		}
		return copiedNode;
	}
	public static int depth(Node root){//求树的深度
		if(root==null){
			return 0;
		}
		else {
			m=depth(root.left);
			n=depth(root.right);
			if(m>n) return m+1;
			else {
				return n+1;
			}
		}
	}
}
