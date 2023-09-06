package project1;

// public class Main {

//     public static void main(String[] args) {

//     project entry1 = new project("Luis7222","100221");



//      }
// }


import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Create a stream of strings
        Stream<String> words = Stream.of("Hello", "world!","test");

        // Count the number of words in the stream
        long wordCount = words.count();

        // Print the number of words
        System.out.println(wordCount);
    }
}
