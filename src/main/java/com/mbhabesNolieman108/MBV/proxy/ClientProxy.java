package com.mbhabesNolieman108.MBV.proxy;

import com.mbhabesNolieman108.MBV.init.ModBlocks;
import com.mbhabesNolieman108.MBV.init.ModItems;
import com.mbhabesNolieman108.MBV.init.ToolInit;

public class ClientProxy implements CommonProxy 
{
	@Override
	public void init() 
	{
		ModItems.registerRenders();
		ToolInit.registerRenders();
		ModBlocks.registerRenders();
	}
}
