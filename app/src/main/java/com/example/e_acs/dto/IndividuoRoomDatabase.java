package com.example.e_acs.dto;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

@Database(entities = {Individuo.class, Familia.class}, version = 1)
public abstract class IndividuoRoomDatabase extends RoomDatabase {
    public abstract IndividuoDAO individuoDAO();
    public abstract FamiliaDAO familiaDAO();


}
