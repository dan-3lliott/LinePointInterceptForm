/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linepointinterceptform.newpackage;

/**
 *
 * @author ellio
 */
public class Point {
    private int distance;
    private String fluvialSetting;
    private String epifaunalSubstrate;
    private String species;
    private String groundCover;
    private String notes;
    public Point(int distance, String fluvialSetting, String epifaunalSubstrate, String species, String groundCover, String notes) {
        this.distance = distance;
        this.fluvialSetting = fluvialSetting;
        this.epifaunalSubstrate = epifaunalSubstrate;
        this.species = species;
        this.groundCover = groundCover;
        this.notes = notes;
    }
    public int getDistance() {
        return distance;
    }
    public String getFluvialSetting() {
        return fluvialSetting;
    }
    public String getEpifaunalSubstrate() {
        return epifaunalSubstrate;
    }
    public String getSpecies() {
        return species;
    }
    public String getGroundCover() {
        return groundCover;
    }
    public String getNotes() {
        return notes;
    }
}
