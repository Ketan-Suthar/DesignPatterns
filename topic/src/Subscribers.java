public class Subscribers implements Observer {
    private String  name;
    private Subject subject;

    public Subscribers(final String name) {
        this.name = name;
    }

    @Override
    public void update() {
        final var message = (String) subject.getUpdate();
        if(message != null){
            System.out.println(this.name + " received update: " + message);
        }else{
            System.out.println("No updates!" + name);
        }
    }

    @Override
    public void setSubject(final Subject subject) {
        this.subject = subject;
    }
}
