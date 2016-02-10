package run;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        king = new ArturTheKing();

        king.speech();

        king.speech("England");
        king.speech("Gawain", 1000);
    }
}
