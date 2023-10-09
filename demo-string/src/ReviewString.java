public class ReviewString {
    public static void main(String[] args) {
        String str = "";
        for (byte i = 127; i < 128; i++) {            
            str += i;
            //System.out.println(str);
            if (i < 0){
                break;
            }
        System.out.println(str);

        // String str2 = "";
        // str2 += -128;
        // System.out.println(str2);

        }
    }
}