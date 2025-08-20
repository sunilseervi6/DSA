//lc557
class Solution {
    public String reverseWords(String s) {
        String[] ch = s.split(" ");
        StringBuilder strb = new StringBuilder();
        for(int i=0 ; i<ch.length; i++){
            strb.append(new StringBuilder(ch[i]).reverse());
            if(i < ch.length-1){
                strb.append(" ");
            }
        }
        
 
        return strb.toString();

    }
}
