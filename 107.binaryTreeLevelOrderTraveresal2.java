public List<List<Integer>> levelOrderBottom(TreeNode root){
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	List<List<Integer>> result = new LinkedList<List<Integer>>();
	
	if(root == null) return result;
	
	queue.offer(root);
	
	while(!queue.isEmpty()){
		int levelNum = queue.size();
		List<Integer> row = new LinkedList<Integer>();
		for(int i = 0; i < levelNum; i++){
			if(queue.peek().left != null) queue.offer(queue.peek().left);
			if(queue.peek().right != null) queue.offer(queue.peek().right);
			row.add(queue.poll().val);
        }
        result.add(0, row);
    }
    return result;
}