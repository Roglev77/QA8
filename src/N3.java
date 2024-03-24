public class N3 { 
    public static void main(String[] args) {
        String text =  "Completely random text in English. In it, we just need to " +
                "determine how man times the character 'a' occurs there. " +
                "And we can use the split method and the length method.";
        char ch1 ='a';
        char ch2 ='A';
        int count1 = text.length() - text.replace(String.valueOf(ch1),  "").length();
        int count2 = text.length() - text.replace(String.valueOf(ch2),  "").length();
        System.out.println(count1 + count2);
    }
}
