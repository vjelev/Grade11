package arraysPackage;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        class Message {
            String phrase;
            String event;
            String author;
            String city;

            public Message(String phrase, String event, String author, String city) {
                this.phrase = phrase;
                this.event = event;
                this.author = author;
                this.city = city;
            }

            // Method to display the message
            public void display() {
                System.out.println(phrase + " " + event + " " + author + " - " + city);
            }
        }

        String[] phrases = { "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] events = { "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] authors = { "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        String[] cities = { "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        Scanner inp = new Scanner(System.in);
        int num = Integer.parseInt(inp.nextLine());
        for (int i = 0; i < num; i++) {
            Message message = new Message(phrases[(int) (Math.random() * (phrases.length - 1))],
                    events[(int) (Math.random() * (events.length - 1))],
                    authors[(int) (Math.random() * (authors.length - 1))],
                    cities[(int) (Math.random() * (cities.length - 1))]
                    );
            message.display();
        }
    }
}

//List<String> listPhrases= Arrays.asList(phrases);








