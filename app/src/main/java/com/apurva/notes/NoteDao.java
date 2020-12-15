package com.apurva.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("INSERT INTO notes (contents) VALUES ('New note')")
    void create();

    @Query("SELECT * FROM notes")
    List<Note> getAllNotes();

    @Query("UPDATE notes SET contents = :contents WHERE id = :id")
    void save(String contents, int id);

    @Query("DELETE FROM notes WHERE id = :id")
    void delete(int id);
}
