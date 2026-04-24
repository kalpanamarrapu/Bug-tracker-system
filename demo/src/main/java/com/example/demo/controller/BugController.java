package com.example.demo.controller;

import com.example.demo.model.Bug;
import com.example.demo.service.Bugservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bugs")
@CrossOrigin
public class BugController {

    @Autowired
    private Bugservice service;

    @GetMapping
    public List<Bug> getBugs() {
        return service.getAllBugs();
    }

    @PostMapping
    public Bug createBug(@RequestBody Bug bug) {
        return service.saveBug(bug);
    }

    @DeleteMapping("/{id}")
    public void deleteBug(@PathVariable Long id) {
        service.deleteBug(id);
    }
}