

import java.util.HashSet;

public class HashSetlar {
    public static void main(String[] args) {


        String[] words = {"Bir", "Sakkiz", "Yetti", "Bir", "Besh", "Ikki", "Bir", "Bir"};
        HashSet<String> set = new HashSet<>();
        for (String s : words){
            set.add(s);
        }

        System.out.println(set);
    }

}
