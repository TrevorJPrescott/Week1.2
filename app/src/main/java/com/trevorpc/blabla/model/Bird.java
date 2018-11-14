package com.trevorpc.blabla.model;

import android.database.sqlite.SQLiteOutOfMemoryException;
import android.util.Log;

import java.sql.SQLOutput;

public class Bird {
    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

    private String reproduction = "egg";
    private String outerCovering = "feather";

    public void flyUp() {
        System.out.println("Flying up...");

        Log.d("TAG", "flyUp: I am FLYING!!!");

    }

    public void flyDown()
    {
        System.out.println("Flying Down...");

    }
}
