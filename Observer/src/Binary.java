public class Binary extends Observer{
    public Binary(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary:"+Integer.toBinaryString(subject.getState()));
    }
}
