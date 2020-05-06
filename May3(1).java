class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        for (int i=0;i<magazine.length(); i++)
        {
            char c1 = magazine.charAt(i);
            map1.put(c1, map1.getOrDefault(c1,0)+1);
            
        }
        
        for(int j=0;j<ransomNote.length(); j++)
            {
                char c2 = ransomNote.charAt(j);
                if(!map1.containsKey(c2) || map1.get(c2) <=0)
                {
                    return false;
                }
                 map1.put(c2, map1.get(c2)-1);
                 
            }
        return true;
    }
}
        
        
        
    
