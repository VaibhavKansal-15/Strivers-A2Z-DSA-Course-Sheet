class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int reverse=0;
        int xcopy=x;

        while(x>0){
            int n=x%10;
            reverse=(reverse*10)+n;
            x=x/10;
        }
        return reverse==xcopy;
    }
}
