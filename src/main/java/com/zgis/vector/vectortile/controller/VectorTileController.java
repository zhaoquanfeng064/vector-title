package com.zgis.vector.vectortile.controller;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zgis.vector.vectortile.service.VectorTileService;


@RestController
@RequestMapping("/vector")
public class VectorTileController {

	@Autowired
	private VectorTileService vectorTileService;
	
	@RequestMapping("/tile/{z}/{x}/{y}")
	public Object getVectorTile(@PathVariable("z") Integer z, @PathVariable("x") Integer x,@PathVariable("y") Integer y,HttpServletResponse response){
		response.setContentType("application/x-protobuf;type=mapbox-vector;chartset=UTF-8");
		return vectorTileService.selectVectorTile(x, y, z);
	}
	
	@RequestMapping("/test")
	public Object test(){
		return "sb";
	}
}
