package com.zgis.vector.vectortile.common;

import com.zgis.vector.vectortile.domain.TileBox;

public class VectorTileUtil {
	  /**
	   * 根据经纬度和缩放等级，求得瓦片路径
	   * **/
	  public static String getTileNumber(final double lat, final double lon, final int zoom) {
	    int xtile = (int)Math.floor( (lon + 180) / 360 * (1<<zoom) ) ;
	    int ytile = (int)Math.floor( (1 - Math.log(Math.tan(Math.toRadians(lat)) + 1 / Math.cos(Math.toRadians(lat))) / Math.PI) / 2 * (1<<zoom) ) ;
	     if (xtile < 0)
	      xtile=0;
	     if (xtile >= (1<<zoom))
	      xtile=((1<<zoom)-1);
	     if (ytile < 0)
	      ytile=0;
	     if (ytile >= (1<<zoom))
	      ytile=((1<<zoom)-1);
	     return("" + zoom + "/" + xtile + "/" + ytile);
	    }


	  /**
	   * 瓦片获得范围
	   * **/ 
	  public static TileBox tile2boundingBox(final int x, final int y, final int zoom) {
	    //BoundingBox bb = new BoundingBox();
	    TileBox bb=new TileBox();
	    bb.setYmax(tile2lat(y, zoom));
	    bb.setYmin(tile2lat(y + 1, zoom));
	    bb.setXmin( tile2lon(x, zoom)); 
	    bb.setXmax(tile2lon(x + 1, zoom));
	    return bb;
	  }

	  /**
	   * 瓦片转换经度
	   * **/
	  public static double tile2lon(int x, int z) {
	     return x / Math.pow(2.0, z) * 360.0 - 180;
	  }

	  /**
	   *瓦片转换纬度
	   * @author zhaoquanfeng 2018年8月13日 下午7:44:08
	   * @param y
	   * @param z
	   * @return
	   * @modify {原因} by zhaoquanfeng 2018年8月13日 下午7:44:08
	   */
	  public static double tile2lat(int y, int z) {
	    double n = Math.PI - (2.0 * Math.PI * y) / Math.pow(2.0, z);
	    return Math.toDegrees(Math.atan(Math.sinh(n)));
	  }
}
