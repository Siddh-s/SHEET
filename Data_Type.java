class Solution {
    static int dataTypeSize(String str) {
         switch (str){
            case "Character" :
            return 1 ;
            case "Integer" :
            return 4 ;
            case "Long" :
            return 8 ;
            case "Float" :
            return 4 ;
            case "Double":
            return 8 ;
        }
            return -1 ;
        // code here
    }
}
