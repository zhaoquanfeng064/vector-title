package com.zgis.vector.vectortile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgis.vector.vectortile.common.VectorTileUtil;
import com.zgis.vector.vectortile.dao.VectorTileMapper;
import com.zgis.vector.vectortile.domain.TileBox;
import com.zgis.vector.vectortile.domain.VectorTile;
import com.zgis.vector.vectortile.service.VectorTileService;

@Service
public class VectorTileServiceImpl implements VectorTileService{

	@Autowired
	private VectorTileMapper vectorTileDao;
	
	@Override
	public byte[] selectVectorTile(Integer x, Integer y, Integer z) {
		TileBox tileBox=VectorTileUtil.tile2boundingBox(x, y, z);
		 VectorTile vTile=vectorTileDao.selectTile(tileBox);
		return vTile.getTile();
	}
}
