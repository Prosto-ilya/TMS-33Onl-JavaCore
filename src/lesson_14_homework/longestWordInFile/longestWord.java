package lesson_14_homework.longestWordInFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class longestWord {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Java_homework\\Lesson3_Homework\\src\\Lesson_14_homework\\longestWordInFile\\txt.txt";
        String output = "C:\\Java_homework\\Lesson3_Homework\\src\\Lesson_14_homework\\longestWordInFile\\txt1.txt";
        try{
            String text=new String(Files.readAllBytes(Path.of(input)));
            String longestWord = "";

            for(String word :text.split("\\W+")){
                if(word.length()> longestWord.length()){
                    longestWord=word;
                }
            }
            Files.write(Path.of(output), longestWord.getBytes());
            System.out.println("The longest word is " + longestWord + " and this word write to file txt1");
        }catch (Exception e){
            System.err.println("Error"+ e.getMessage());
        }
    }
}
