package com.zgis.vector.vectortile.domain;

import java.io.Serializable;

public class TileBox implements Serializable {

	 private static final long serialVersionUID = 1L;
	 
	 private Double xmin;
	 
	 private Double ymin;
	 
	 private Double xmax;
	 
	 private Double ymax;

	public Double getXmin() {
		return xmin;
	}

	public void setXmin(Double xmin) {
		this.xmin = xmin;
	}

	public Double getYmin() {
		return ymin;
	}

	public void setYmin(Double ymin) {
		this.ymin = ymin;
	}

	public Double getXmax() {
		return xmax;
	}

	public void setXmax(Double xmax) {
		this.xmax = xmax;
	}

	public Double getYmax() {
		return ymax;
	}

	public void setYmax(Double ymax) {
		this.ymax = ymax;
	}
	 
}
