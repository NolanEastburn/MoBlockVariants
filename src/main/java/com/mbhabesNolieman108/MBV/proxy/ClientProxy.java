package com.mbhabesNolieman108.MBV.proxy;

import com.mbhabesNolieman108.MBV.init.ModArmor;
import com.mbhabesNolieman108.MBV.init.ModBlocks;
import com.mbhabesNolieman108.MBV.init.ModItems;
import com.mbhabesNolieman108.MBV.init.ModTools;

public class ClientProxy implements CommonProxy 
{
	@Override
	public void init() 
	{
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
	}
}
