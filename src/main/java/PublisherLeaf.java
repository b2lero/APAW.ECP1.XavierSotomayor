
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
        throw new UnsupportedOperationException("Can't do that");
    }

    @Override
    public void remove(PublisherComponent publisherComponent) {
    }

    public String view(){
        return this.publisher.getId();
    }
}
