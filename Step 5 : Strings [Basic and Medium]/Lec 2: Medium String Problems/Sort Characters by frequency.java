class Solution {
    public String frequencySort(String s) {
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        List<Character> list=new ArrayList(map.keySet());
        Collections.sort(list, (c1, c2) -> map.get(c2) - map.get(c1));

        for(char ch:list){
            int count=map.get(ch);
            for(int i=0;i<count;i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}
