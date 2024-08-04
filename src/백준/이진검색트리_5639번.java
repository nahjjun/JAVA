package 백준;
import java.util.*;
public class 이진검색트리_5639번 {
	public static class Node{
		Node leftNode, rightNode;
		int data;
		public Node(int _data){
			data = _data;
			leftNode=null;
			rightNode=null;
		}
	}
	public static class Tree{
		Node root;
		 public void put(int data) { // 나무에 데이터를 넣는 함수
	            root = insert(root, data);
	        }

		 public Node insert(Node root, int data) {
			 if (root == null) { // 루트 노드가 비었으면 루트 노드 설정
				 root = new Node(data);
	             return root; // 이는 트리의 끝쪽에까지 다다랐을 때 해당 노드를 생성해서 주소를 반환해줌으로써 끝에 노드가 추가된다.
			 }
	         if (data < root.data) { // 만약 넣어준 데이터가 부모 노드의 데이터보다 작으면
	        	 root.leftNode = insert(root.leftNode, data); // 해당 부모 노드의 좌측 트리로 보낸다
	         } else if (data > root.data) { // 만약 넣어준 데이터가 부모 노드의 데이터보다 크면
	        	 root.rightNode = insert(root.rightNode, data); // 해당 부모 노드의 우측 트리로 보낸다
	         }
	         return root;
		 }

	     public void postOrder(Node node) {
	    	 if (node == null) {
	    		 return;
	    	 }
	         	postOrder(node.leftNode);
	            postOrder(node.rightNode);
	            System.out.println(node.data);
	     }
	}
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Tree tree = new Tree();

	        while (scan.hasNext()) {
	            int tmp = scan.nextInt();
	            tree.put(tmp);
	        }

	        tree.postOrder(tree.root);
	        scan.close();
	    }
}
