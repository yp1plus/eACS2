package com.example.e_acs.dto;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface FamiliaDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertFamilia (Familia familia);

}
