package com.trevorpc.blabla.model;

public class Eagle extends Bird
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String name;
        public int lifespan;

    public Eagle(String name, int lifespan)
    {
        this.name = name;
        this.lifespan = lifespan;
    }

    public static final String INDEX_OF_ARRAY = "always";

}
