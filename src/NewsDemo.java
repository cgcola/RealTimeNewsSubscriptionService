public class NewsDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        RealTimeSubscriber subscriber1 = new RealTimeSubscriber("Juan");
        RealTimeSubscriber subscriber2 = new RealTimeSubscriber("Maria");

        agency.attach(subscriber1);
        agency.attach(subscriber2);

        agency.setLatestNews("PAGASA raises Signal No. 1 in Bicol Region due to Typhoon Kopong.");

        System.out.println("\n[System]: Maria has unsubscribed from news alerts.");
        agency.detach(subscriber2);

        agency.setLatestNews("MMDA announces suspension of Number Coding Scheme for holidays.");

        System.out.println("\n[System]: Pedro has subscribed to news alerts.");
        RealTimeSubscriber subscriber3 = new RealTimeSubscriber("Pedro");
        agency.attach(subscriber3);

        agency.setLatestNews("J.P. Morgan to Close Analytics Unit, Affecting 250 Jobs in the Philippines.");
    }
}
