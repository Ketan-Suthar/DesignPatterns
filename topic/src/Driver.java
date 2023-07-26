public class Driver {
    public static void main(String[] args) {
        Subject subject = new Topic();

        Observer observer1 = new Subscribers("Ichigo");
        Observer observer2 = new Subscribers("Chad");
        Observer observer3 = new Subscribers("Kisuke");

        observer1.setSubject(subject);
        observer2.setSubject(subject);
        observer3.setSubject(subject);

        subject.register(observer1);
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        observer1.update();

        subject.postMessage("wako mundo");

        observer1.update();
    }
}