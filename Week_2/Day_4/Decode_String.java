class Solution {

    int index = 0;

    public String decodeString(String s){
        StringBuilder result = new StringBuilder();

        while(index < s.length() && s.charAt(index) != ']')
        {
            if (Character.isDigit(s.charAt(index))){
                int k = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index))){
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++;
                String inner = decodeString(s);
                index++;
              
                for (int i = 0; i < k; i++) {
                    result.append(inner);
                }
            } 
            else{
                result.append(s.charAt(index));
                index++;
            }
        }
        return result.toString();
    }
}
