package Homework;

public class StringToBinary {
    public static void main(String[] args) {
        String name = "Violetta";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            builder.append(Integer.toBinaryString(c)).append(' ');
        }
        System.out.println(builder);
    }
}
