package main;

import java.util.ArrayList;
import java.util.List;

public class PublisherComposite extends PublisherComponent {

    private List<PublisherComponent> publisherComponentList;
    public PublisherComposite (String name){
        super(name);
        this.publisherComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(PublisherComponent publisherComponent) {
        publisherComponentList.add(publisherComponent);
    }


    @Override
    public void remove(PublisherComponent publisherComponent) {
        publisherComponentList.remove(publisherComponent);
    }


    @Override
    public String view() {

        return super.view();
    }
}
