/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.persistence.models;

/**
 *
 * @author Lenovo
 */
public class ItemModel {
    
    private int id;
    private String nombre;
    private String descripcion;
    private String url;
    private int blnsql;
    
    private String search;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	public int getBlnsql() {
		return blnsql;
	}

	public void setBlnsql(int blnsql) {
		this.blnsql = blnsql;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
    
}
