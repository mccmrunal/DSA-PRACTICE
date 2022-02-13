
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer>  list  = new ArrayList<Integer>();
     Stack<TreeNode> stack = new Stack<TreeNode>();
    
        while(!stack.isEmpty() || root!=null){
          
            if(root!=null){
                stack.push(root);
                root= root.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    list.add(temp.val);
                    
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        list.add(temp.val);
                    }
                }
                else{
                    root = temp;
                }
            }
            
            
        }
        return list;
            
    }
}
