package com.rsk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// Write a java code and call it from kotlin to see how kotlin deals with nullable variable
public class Meeting {
    private String title;

//    the notnull notation means that title cannot be null
    public void addTitle(@NotNull String title){
        this.title = title;
    }

//    make nullable notation to remove the exception -> this enables kotlin to assign a null value
    public @Nullable String meetingTitle(){
        return title;
    }

    public String titleCanBeNull(){
        return title; 
    }
}
