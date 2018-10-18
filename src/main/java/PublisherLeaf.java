import com.sun.xml.internal.ws.server.UnsupportedMediaException;

public class PublisherLeaf extends PublisherComponent{

    private Publisher publisher;

    public PublisherLeaf(Publisher publisher){
        super(publisher.getId());
        this.publisher = publisher;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(PublisherComponent publisherComponent) {
    }

    @Override
    public void remove(PublisherComponent publisherComponent) {
    }

    public String view(){
        return this.publisher.getId();
    }
}
