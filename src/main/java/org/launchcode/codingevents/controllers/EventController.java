package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String displayEvents(Model model){
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    //form
    @GetMapping("create") //lives at events/create
    public String renderCreateEventForm(){
        return "events/create";
    }

    //form handler method
    @PostMapping("create") //lives at /events/create
    public String createEvent(@RequestParam String eventName, Model model) {
        events.add(new Event(eventName));
        model.addAttribute("eventName", eventName);
        return "redirect:";
    }
}
