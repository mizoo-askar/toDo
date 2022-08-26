package com.mizoo.askar.todoapp.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDB extends RoomDatabase {
    public static volatile NoteDB INSTANCE;
    public abstract NoteDao noteDao();

    public static NoteDB getInstance(Context context){
        if (INSTANCE == null){
            synchronized (NoteDB.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext()
                    ,NoteDB.class, "note_db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
