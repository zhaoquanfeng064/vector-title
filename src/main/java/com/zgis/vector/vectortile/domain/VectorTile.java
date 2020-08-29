package com.zgis.vector.vectortile.domain;

import java.io.Serializable;

public class VectorTile implements Serializable {
	 private static final long serialVersionUID = 1L;
	 
    private Integer id;
   
    private String name;
   
    private Object geom;

    private byte[] tile;

  
    public Integer getId() {
        return id;
    }

  
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    
    public Object getGeom() {
        return geom;
    }

  
    public void setGeom(Object geom) {
        this.geom = geom;
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", geom=").append(geom);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


	public byte[] getTile() {
		return tile;
	}


	public void setTile(byte[] tile) {
		this.tile = tile;
	}
}