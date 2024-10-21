package cau2;

import java.util.HashMap;
import java.util.Map;


public class WordCount {
    public static void main(String[] args) {

        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce iaculis pretium mauris quis placerat. Aenean efficitur efficitur mollis mollis mollis mollis mollis elementum tempor tempor tempor bibendum bibendum purus purus augue augue justo lorem lorem leo leo nam nam nam nam nam id id id id id habitant volutpat volutpat ac ac ac ac sodales sodales in in in in in in in in in";
        input = input.toLowerCase().replaceAll("[.,]", "");

        String[] words = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
