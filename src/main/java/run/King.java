package run;

public class King {

    public void speech() {
        System.out.println("I am the King!");
    }

    public void speech(String kingdom) {
        System.out.println("I am the king of " + kingdom);
    }

    public void speech(String primeminister, int enemy) {
        System.out.println(primeminister + ", behead the enemy! " + enemy + " of them!");
    }

}
