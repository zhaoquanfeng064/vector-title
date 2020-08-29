package com.zgis.vector.vectortile.dao;

import com.zgis.vector.vectortile.domain.TileBox;
import com.zgis.vector.vectortile.domain.VectorTile;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VectorTileMapper {
   
    int deleteByPrimaryKey(Integer id);

   
    int insert(VectorTile record);

   
    VectorTile selectByPrimaryKey(Integer id);

   
    List<VectorTile> selectAll();

    int updateByPrimaryKey(VectorTile record);
    
    VectorTile selectTile(TileBox tileBox);
}