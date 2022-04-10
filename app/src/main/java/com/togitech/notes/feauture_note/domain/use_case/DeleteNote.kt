package com.togitech.notes.feauture_note.domain.use_case

import com.togitech.notes.feauture_note.domain.model.Note
import com.togitech.notes.feauture_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}