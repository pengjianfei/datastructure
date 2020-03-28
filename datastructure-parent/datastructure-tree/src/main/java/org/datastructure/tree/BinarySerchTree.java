package org.datastructure.tree;

public class BinarySerchTree<E> {

	/***
	 * 树的节点个数
	 */
	private int capacity = 0;

	private Node<E> rootNode;// 定义根节点

	/***
	 * s元素个数
	 * 
	 * @return
	 */
	public int size() {
		return capacity;
	}

	/**
	 * 是否为空树
	 * 
	 * @return
	 */
	boolean isEmpty() {
		return capacity == 0;
	}

	/**
	 * 清空列表
	 */
	public void clear() {
		capacity = 0;
		rootNode = null;
	}

	/**
	 * 增加元素
	 * 
	 * @param e
	 */
	public void add(E element) {
		if (rootNode == null) {//根节点
			rootNode = new Node<E>(element);
			rootNode.setParentNode(null);
		}else {//子节点
			addChild(rootNode, element);
		}
		capacity++;
		

	}
	/**
	 * 增加子元素
	 * 增加主题方法思路清晰
	 *   左右节点添加的逻辑统一处理
	 * @param e
	 */
	private void addChild(Node<E> root,E element) {
		while (true) {
 			if(compare(root.getVale(),element)>0) {
				if(root.leftNode == null) {
					root.rightNode=new Node<E>(root, element);
					return;
				}
				root = root.leftNode;
 			}else {
				if(root.leftNode == null) {
					root.leftNode=new Node<E>(root, element);
					return;
				}
				root = root.rightNode;
			}	
		}
		

	}
	
	private int compare(E e1,E e2) {
		return 0;
	}

	/***
	 * 删除某个元素
	 * 
	 * @param elementzsz
	 */
	public void remove(E element) {

	}

	/**
	 * 是否包含某个元素
	 * 
	 * @param element
	 * @return
	 */
	public boolean contains(E element) {
		return false;
	}

 

	/***
	 * 二叉搜索树 1)可以比较 2)左节点值比右节点值小 3)暂时不考虑相同的值
	 * 
	 * 所有定义一个内部存储数据类型Node
	 */

	private class Node<T> {
		private Node<T> parentNode;// 父节点
		private Node<T> leftNode;// 左节点
		private Node<T> rightNode;// 右节点
		private T vale;// 节点值

		public Node(Node<T> parentNode, T vale) {
			this.parentNode = parentNode;
			this.vale = vale;
		}

		/***
		 * 只构造一个有数据的节点
		 * 
		 * @param vale
		 */
		public Node(T vale) {
			this.vale = vale;
		}

		public Node<T> getParentNode() {
			return parentNode;
		}

		public void setParentNode(Node<T> parentNode) {
			this.parentNode = parentNode;
		}

		public Node<T> getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node<T> leftNode) {
			this.leftNode = leftNode;
		}

		public Node<T> getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node<T> rightNode) {
			this.rightNode = rightNode;
		}

		public T getVale() {
			return vale;
		}

		public void setVale(T vale) {
			this.vale = vale;
		}

	}
}
