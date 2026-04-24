package com.example.demo.service;

import com.example.demo.model.Bug;
import com.example.demo.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bugservice {

    @Autowired
    private BugRepository repo;

    public List<Bug> getAllBugs() {
        return repo.findAll();
    }

    public Bug saveBug(Bug bug) {
        return repo.save(bug);
    }

    public void deleteBug(Long id) {
        repo.deleteById(id);
    }
}