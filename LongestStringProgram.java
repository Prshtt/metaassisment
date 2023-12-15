public class LongestStringProgram {
    public static void main(String[] args) {
        String[] strings = {"dummy text of the printing and typesetting industry"};
        String longestString = "";
        String[] strings = {" “It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English”\r\n" + //
                ""};
        String longestString = "";

        for (String str : strings) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        
        System.out.println("Longest string: " + longestString);
    }
}
