package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model){
        List<String> eventsList = new ArrayList<>();
        eventsList.add("Conference");
        eventsList.add("Birthday Party");
        eventsList.add("Fundraiser");
        model.addAttribute("events", eventsList);
        return "events/index";
    }
}
