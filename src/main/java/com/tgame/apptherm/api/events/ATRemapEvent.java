package com.tgame.apptherm.api.events;

import com.tgame.apptherm.api.tiles.IATCoolantMachine;

import appeng.api.DimentionalCoord;
import appeng.api.me.tiles.IGridTileEntity;

/**
 * 
 * fire when the Map needs to be recalculated. used internally.
 * Do not fire.
 * 
 * @author tgame14
 *
 */
public final class ATRemapEvent extends ATEvent {

	public final DimentionalCoord dim;
	
	public ATRemapEvent(IATCoolantMachine tile, DimentionalCoord dim) {
		super(tile);
		this.dim = dim; 
	}

}
