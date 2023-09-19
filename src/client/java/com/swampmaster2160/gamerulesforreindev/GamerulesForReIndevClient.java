package com.swampmaster2160.gamerulesforreindev;

import com.fox2code.foxloader.loader.ClientMod;
import com.swampmaster2160.gamerulesforreindev.gamerules.GameRuleDoDayNightCycle;

public class GameRulesForReIndevClient extends GameRulesForReIndev implements ClientMod {
	@Override
	public void onInit() {
		// Client specific code

		// Register game rules
		GameRule.registerGameRule("doDayNightCycle", new GameRuleDoDayNightCycle());
	}
}
