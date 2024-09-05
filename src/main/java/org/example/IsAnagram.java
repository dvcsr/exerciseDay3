package org.example;

public class IsAnagram {
    public static void main(String[] args) {

    }
    public boolean validAnagram(String str, String pair) {
        if(str.length() != pair.length()){
            return false;
        }

        char[] strArr = str.toCharArray();
        char[] pairArr = pair.toCharArray();


        //Arrays.sort(strArr);
        str = new String(strArr);

        //Arrays.sort(pairArr);
        pair = new String(pairArr);

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != pair.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
