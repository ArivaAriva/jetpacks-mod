package lv.arivaariva.jetpacks.proxy;

import lv.arivaariva.jetpacks.init.CustomBlocks;
import lv.arivaariva.jetpacks.init.CustomItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		CustomItems.registerRenders();
		CustomBlocks.registerRenders();
		
	}

}
