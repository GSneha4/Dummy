/**package jmock.java;

import org.jmock.*;
import org.jmock.auto.Mock;
import org.jmock.cglib.MockObjectTestCase;

class PublisherTest extends MockObjectTestCase {
    public void testOneSubscriberReceivesAMessage() {
        // set up
        Mock mockSubscriber = mock(Subscriber.class);
        Publisher publisher = new Publisher();
        publisher.add((Subscriber) mockSubscriber.proxy());
        
        final String message = "message";
        
        // expectations
        mockSubscriber.expects(once()).method("receive").with( eq(message) );
        
        // execute
        publisher.publish(message);
    }
}
**/