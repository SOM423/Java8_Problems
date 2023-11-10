public class LRRotation {
    public static String leftRotate(String str, int d) {
        
        int length = str.length();
       
        d = d % length;

        return str.substring(d) + str.substring(0, d);

    }

    public static String rightRotate(String str, int d) {

        int length = str.length();
       
        d = d % length;
        
        return str.substring(length-d) + str.substring(0,length-d);
    }
}
