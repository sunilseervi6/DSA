class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0 ;
        String key = Integer.toString(x )+ '$' +Integer.toString(y);
        set.add(key);
        for(char ch : path.toCharArray()){
            if(ch == 'N'){
                y++;
            }
            if(ch == 'S'){
                y--;
            }
            if(ch == 'E'){
                x++;
            }
            if(ch == 'W'){
                x--;
            }
            key = Integer.toString(x )+ '$' +Integer.toString(y); 
            if(set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }
}
            
        
