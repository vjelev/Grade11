package arraysPackage;

import java.util.Scanner;

public class Articles {
    String title;
    String content;
    String author;

    public void Rename(String title) {
        this.title = title;
    }

    public void Edit(String content) {
        this.content = content;
    }

    public void ChangeAuthor(String author) {
        this.author = author;
    }

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String[]info = initialInput.split(", ");
        Articles article = new Articles(info[0],info[1],info[2]);

        for(int i = 0;i<n;i++)
        {
            String reInput = scanner.nextLine();
            String[]input = reInput.split(": ");
            if(input[0].equals("Edit"))article.Edit(input[1]);
            if(input[0].equals("ChangeAuthor"))article.ChangeAuthor(input[1]);
            if(input[0].equals("Rename"))article.Rename(input[1]);
        }
        System.out.println(article.toString());
    }
}
