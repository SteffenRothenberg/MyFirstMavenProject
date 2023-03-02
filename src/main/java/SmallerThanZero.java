public class SmallerThanZero {

    public static void main(String[] args){

        System.out.println(smallerThanZero(-2));
    }
    public static boolean smallerThanZero(int i) {
        if (i < 0) {
            return true;
        } else {
            return false;
        }
    }
}

