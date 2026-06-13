public class Test {
    public static void main(String[] args) {

    Veena v = new Veena();
    Saxophone s = new Saxophone();

    v.play();  // a
    s.play();  // b

    Playable p = new Veena();  // c
    p.play();

    p = new Saxophone();
    p.play();

    }
}
