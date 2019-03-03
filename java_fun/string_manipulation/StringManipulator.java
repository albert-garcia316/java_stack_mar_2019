public class StringManipulator {
    public String trimAndConcat(String strA, String strB){
        String output = new String();
        String temp = strA.trim(); 
        output = temp.concat(strB.trim());
        return output;
    }
    public Integer getIndexOrNull(String str, char c){
        Integer output = str.indexOf(c);
        if(output == -1){
            return null;
        }
        return output;
    }
    public Integer getIndexOrNull(String strA, String strB){
        Integer output = strA.indexOf(strB);
        if(output == -1){
            return null;
        }
        return output;
    }
    public String concatSubstring(String strA, int x, int y, String strB){
        String output = strA.substring(x, y).concat(strB);
        
        return output;
    }
}