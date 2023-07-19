import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A_New_Story {

    public static void main(String[] args) {
        try {
            File file = new File("A_New_Story.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Once upon a time there lived a young man in a small village. He was poor, but he had dreams to change his life. \n");
            writer.write("He wanted nothing more than to see the world, so he decided to set off on an adventure. He packed his belongings \n");
            writer.write("and set out on his journey. After many days of walking, he came upon a castle. He was amazed by its beauty and \n");
            writer.write("wondered who lived there. He knocked on the door and was welcomed by a kindly old man who said he was the king of the \n");
            writer.write("castle. The king offered him a place to stay and he accepted. The king then told him the story of how he had come to be \n");
            writer.write("in the castle. Many years ago, the king had been a poor peasant, like the young man, but then he had set off on his own \n");
            writer.write("adventure and had come across the castle. He had worked hard to make it his home and had been living there ever since. \n");
            writer.write("The young man was inspired by the king's story and decided to stay and help him. Together they worked hard and \n");
            writer.write("eventually the castle was restored to its former glory. The young man was now living his dream and he was grateful \n");
            writer.write("to the king for making it all possible. He thanked the king and said he would stay and help him as long as he was \n");
            writer.write("needed. The king was grateful and the two lived happily in the castle ever after. \n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}