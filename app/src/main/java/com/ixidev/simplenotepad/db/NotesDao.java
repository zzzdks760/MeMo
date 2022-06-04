package com.ixidev.simplenotepad.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.ixidev.simplenotepad.model.Note;

import java.util.List;

@Dao
public interface NotesDao {

     // DB에 메모삽입 및 저장

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

     // 노트 삭제

    @Delete
    void deleteNote(Note... note);

     // 노트 업데이트

    @Update
    void updateNote(Note note);


     // DB 메모 리스트

    @Query("SELECT * FROM notes")
    List<Note> getNotes();


    @Query("SELECT * FROM notes WHERE id = :noteId")
    Note getNoteById(int noteId);


    @Query("DELETE FROM notes WHERE id = :noteId")
    void deleteNoteById(int noteId);

}
