package com.example.e_acs.dto;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface IndividuoDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertIndividuo (Individuo individuo);

    @Update
    void updateIndividuo (Individuo individuo);

    @Delete
    void deleteIndividuo (Individuo individuo);

    @Query("DELETE FROM Individuo")
    void deleteAll();

    @Query("SELECT id, nome FROM Individuo")
    public List<Individuo> getAllIndividuos();

    @Query("SELECT * FROM Individuo WHERE nome like :name LIMIT 1")
    public Individuo findIndividuo(String name);

}
