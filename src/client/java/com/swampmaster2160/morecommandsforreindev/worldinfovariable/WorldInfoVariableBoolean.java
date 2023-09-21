package com.swampmaster2160.morecommandsforreindev.worldinfovariable;

import org.jetbrains.annotations.Nullable;

import com.swampmaster2160.morecommandsforreindev.MoreCommandsForReIndev;
import com.swampmaster2160.morecommandsforreindev.WorldInfoVariable;

import net.minecraft.src.game.level.World;

public abstract class WorldInfoVariableBoolean extends WorldInfoVariable {
	@Override
	public String getValueAsString(World world) {
		return "" + getValue(world);
	}

	@Override
	public boolean setValueAsString(World world, String value) {
		// Get value type from string
		@Nullable Boolean booleabValue = MoreCommandsForReIndev.parseBool(value);
		if (booleabValue == null) return false;
		// Set value
		setValue(world, booleabValue);
		return true;
	}

	public abstract boolean getValue(World world);
	public abstract void setValue(World world, boolean value);
}
