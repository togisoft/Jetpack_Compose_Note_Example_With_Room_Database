package com.togitech.notes.feauture_note.presentation.notes

import com.togitech.notes.feauture_note.domain.model.Note
import com.togitech.notes.feauture_note.domain.util.NoteOrder
import com.togitech.notes.feauture_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
