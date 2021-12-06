package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    //abstraction & encapsulation
    //this is a static class (a class with all static fields and methods)
    // need a place to put events data structure/property
    private static final Map<Integer, Event>  events = new HashMap<>();

    //behaviors:
    //get all events
    public static Collection<Event> getAll() {
        return events.values();
    }

    //get a single vent
    public static Event getById(int id) {
        return events.get(id);
    }
    //add an event
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    //remove an event
    public static void delete(int id) {
        events.remove(id);
    }
}
