public class RealTimeSubscriber implements Subscriber {
    private String subscriberName;

    public RealTimeSubscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(" >> " + subscriberName + " received update: " + news);
    }
}
