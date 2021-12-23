import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        
        Stream<String> langs = Stream.of("Inglês", "Espanhol", "Grego");
        langs.forEach(v -> System.out.println(v));
    }
}
