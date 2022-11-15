package com.example.singerapp;

public class PoliceRVModel {
    String name;
    private int image;
    private String capbac;
    private String noicongtac;
    int pos;


    public PoliceRVModel(String name, String capbac, String noicongtac ,int image, int pos){

        this.name = name;
        this.image = image;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.pos = pos;
    }

    public String getName(){
        return name;
    }

    public String getCapbac(){
        return capbac;
    }

    public String getNoicongtac(){
        return noicongtac;
    }

    public int getImage(){
        return  image;
    }

    public int getPos(){
        return  pos;
    }
}
