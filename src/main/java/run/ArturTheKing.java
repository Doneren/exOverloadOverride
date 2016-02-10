package run;

public class ArturTheKing extends King {
    public void speech(String kingdom) {
        System.out.println("I am the king of " + kingdom + ", and i will rule justly!");
    }

    public void speech(String primeminister, int enemy) {
        System.out.println(primeminister + ", free " + enemy + " enemies, do not cut them!");
    }
}
