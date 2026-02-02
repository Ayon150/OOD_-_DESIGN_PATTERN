public class Octal extends Observer{
    public Octal(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal:"+Integer.toOctalString(subject.getState()));
    }
}
