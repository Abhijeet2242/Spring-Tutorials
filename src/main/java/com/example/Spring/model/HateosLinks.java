package com.example.Spring.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.hateoas.Link;


public class HateosLinks {
    private List<Link> links = new ArrayList<>();

    public void addLink(Link link) {
        links.add(link);
    }
    public List<Link> getLinks() {
        return links;
    }
}
