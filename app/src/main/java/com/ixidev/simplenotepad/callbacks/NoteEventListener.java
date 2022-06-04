package com.ixidev.simplenotepad.callbacks;

import com.ixidev.simplenotepad.model.Note;

public interface NoteEventListener {

    void onNoteClick(Note note);

    void onNoteLongClick(Note note);
}
