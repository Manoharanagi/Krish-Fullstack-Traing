/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiat;

/**
 *
 * @author Dell
 */
public class Employe {
    private int id;
    private String code;
    
    private String name;
    private String Nic;
    
    private String addres;

    public Employe(int id, String code, String name, String Nic, String addres) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.Nic = Nic;
        this.addres = addres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    
    
}
