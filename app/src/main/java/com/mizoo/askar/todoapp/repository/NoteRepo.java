package com.mizoo.askar.todoapp.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.mizoo.askar.todoapp.model.Note;
import com.mizoo.askar.todoapp.model.NoteDB;
import com.mizoo.askar.todoapp.model.NoteDao;

import java.util.List;

public class NoteRepo {
    NoteDao noteDao;
    LiveData<List<Note>> allNotes;

    public NoteRepo(Application application){
        NoteDB noteDB = NoteDB.getInstance(application);
        noteDao = noteDB.noteDao();
        allNotes = noteDao.getAllNotes();
    }

    public void insert(Note note){

    }

    public void update(Note note){

    }

    public void deleteAllNotes(Note note){

    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }


}
