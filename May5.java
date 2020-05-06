class Solution {
    public int firstUniqChar(String s) {
        
        char[] chars = s.toCharArray();
        int[] map = new int[26];
       
        for(int i=0;i<chars.length;i++)
        {
            int key = chars[i] - 'a';
            if(map[key] <0) continue;
            map[key] = map[key] == 0 ?  i+1 :-1;
            
        }
        
        
        int minIndex = Integer. MAX_VALUE;
        for(int i=0; i<map.length;i++)
        {
            if(map[i] > 0 && map[i] < minIndex)
            {
                minIndex =  map[i];
                
            }
        }
        
        return minIndex == Integer. MAX_VALUE ? -1 : minIndex -1;
        
    
}
   
}
