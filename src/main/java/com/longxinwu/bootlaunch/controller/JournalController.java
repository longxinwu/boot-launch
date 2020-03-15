package com.longxinwu.bootlaunch.controller;

import com.longxinwu.bootlaunch.domain.Journal;
import com.longxinwu.bootlaunch.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class JournalController {
    @Autowired
    JournalRepository journalRepo;
    @RequestMapping("/journal")
    public String index(Model model){
        model.addAttribute("journal", journalRepo.findAll());
        return "index";
    }
    @RequestMapping("/saveData")
    public String saveJournal() throws ParseException {
        journalRepo.save(new Journal("Happy","New"));
        return "successful";
    }
    @RequestMapping("/getData")
    public String getJournal(){
        Journal journal = journalRepo.getOne(1L);
        String str = journal.toString();
        return str;
    }
}
