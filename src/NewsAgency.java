import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency implements NewsSubject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    //Method to activate the news update
    public void setLatestNews(String news) {
        this.latestNews = news;
        System.out.println("[" + LocalTime.now() + "] NEU News Online (NEWS UPDATE): " + news);
        notifySubscribers();
    }
}
