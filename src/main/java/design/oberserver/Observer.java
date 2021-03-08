package design.oberserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public interface Observer {
    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
