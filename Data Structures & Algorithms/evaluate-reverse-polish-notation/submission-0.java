class Solution {
    public int evalRPN(String[] tokens) {
        List<String> ops = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack();

        for(String s : tokens){
            if(ops.contains(s)){
                int pop1 = stack.pop();
                int pop2 = stack.pop();

                int res;
                switch(s){
                    case "+":
                        res = pop2 + pop1;
                        stack.push(res);
                        break;
                    case "-":
                        res = pop2 - pop1;
                        stack.push(res);
                        break;
                    case "/":
                        res = pop2 / pop1;
                        stack.push(res);
                        break;
                    case "*":
                        res = pop2 * pop1;
                        stack.push(res);
                        break;
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }    
        return stack.pop();
    }
}
