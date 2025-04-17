class Solution {
    public int reverse(int x) {
        int answer=0;
        while(x!=0){
            int n=x%10;
            x=x/10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && n > 7)) return 0;
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && n < -8)) return 0;
            answer=answer*10+n;
        }
        return answer;
    }
}
