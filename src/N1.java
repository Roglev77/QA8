//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class N1 {
    public static void main(String[] args) {
       String string1 = "This line that i want to cut, cause it is too long";
       String string2 = string1.substring(0,35);
       String string3 = string2 + " it is perfect";
        System.out.println(string1);
        System.out.println(string1.length());
        System.out.println(string2);
        System.out.println(string2.length());
        System.out.println(string3);
        System.out.println(string3.length());
    }
}