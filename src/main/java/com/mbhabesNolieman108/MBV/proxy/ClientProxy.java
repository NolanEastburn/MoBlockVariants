package com.mbhabesNolieman108.MBV.proxy;

import com.mbhabesNolieman108.MBV.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}



}
