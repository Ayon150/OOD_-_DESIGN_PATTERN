public class ObserverDemo {
    static void main() {
        Subject subject = new Subject();

        new Binary(subject);
        new Octal(subject);

        subject.setState(15);

    }
}
