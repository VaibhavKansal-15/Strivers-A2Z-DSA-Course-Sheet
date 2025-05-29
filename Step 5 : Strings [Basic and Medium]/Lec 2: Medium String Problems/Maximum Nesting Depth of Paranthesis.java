class Solution {
    public int maxDepth(String s) {
        int count=0;
        int answer=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                answer=Math.max(answer,count);
            }else if(ch==')'){
                count--;
            }
        }
        return answer;
    }
}
