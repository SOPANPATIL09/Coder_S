public class FirstOccurence {

    public int checkFirstIndexOccurence(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        FirstOccurence fo = new FirstOccurence();
        String str = "engineering";
        String str1 = "eering";

        System.out.println(fo.checkFirstIndexOccurence(str, str1));
    }
}