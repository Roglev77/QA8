public class N2 {
    public static void main(String[] args) {
        String string = "Testing,is my favourite job";
        String[] word = string.split ("[, ]");
        System.out.println("Word = " + word[0] + ", Length = " + word[0].length());
        System.out.println("Word = " + word[1] + ", Length = " + word[1].length());
        System.out.println("Word = " + word[2] + ", Length = " + word[2].length());
        System.out.println("Word = " + word[3] + ", Length = " + word[3].length());
        System.out.println("Word = " + word[4] + ", Length = " + word[4].length());
        System.out.println(word[0].length() > word[1].length());
    }
}
