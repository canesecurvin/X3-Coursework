package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    Optional<NoteDto> findNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    @Transactional
    void deleteNoteById(Long noteId);

    List<NoteDto> getAllNotesByUserId(Long userId);
}
