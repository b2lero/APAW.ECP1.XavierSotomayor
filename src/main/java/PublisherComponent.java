public abstract class PublisherComponent {

    private String name;

    public PublisherComponent(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract boolean isComposite();

    public abstract void add(PublisherComponent publisherComponent);

    public abstract void remove(PublisherComponent publisherComponent);

    public String view(){
        return this.name;
    };
}
