package com.devmountain.noteApp.controllers;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.services.NoteService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping("/addNote/{userId}")
    public void addNote(@RequestBody  NoteDto noteDto,@PathVariable Long userId){
        noteService.addNote(noteDto, userId);
    }

    @PutMapping
    public void updateNote(@RequestBody NoteDto noteDto){
        noteService.updateNoteById(noteDto);
    }

    @DeleteMapping("/{noteId}")
    public void deleteNote(@PathVariable Long noteId){
        noteService.deleteNoteById(noteId);
    }

    @GetMapping("/getNotes/{userId}")
    public List<NoteDto> getNotes(@PathVariable Long userId){
        return noteService.getAllNotesByUserId(userId);
    }

    @GetMapping("/{noteId}")
    public Optional<NoteDto> findNote(@PathVariable Long noteId){
        return noteService.findNoteById(noteId);
    }
}
