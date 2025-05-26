class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count>0){
                    str.append(c);
                }
                count++;    
            }else if(c==')'){
            count--;
                if(count>0){
                str.append(c);
                }
            }
        }
        return str.toString();
    }
}
