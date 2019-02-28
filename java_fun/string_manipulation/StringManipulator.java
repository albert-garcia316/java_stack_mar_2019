public class StringManipulator {
    public String trimAndConcat(String strA, String strB){
        String output = new String();
        String temp = strA.trim(); 
        output = temp.concat(strB.trim());
        return output;
    }
    public Integer getIndexOrNull(String str, char c){
        Integer output = str.indexOf(c);
        return output;
    }
    public Integer getIndexOrNull(String strA, String strB){
        Integer output = strA.indexOf(strB);
        return output;
    }
}