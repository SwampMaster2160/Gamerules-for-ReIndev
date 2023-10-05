package com.swampmaster2160.morecommandsforreindev.entitytargetbinaryoperator;

import java.util.ArrayList;

import com.swampmaster2160.morecommandsforreindev.EntityTargetBinaryOperator;

import net.minecraft.src.game.entity.Entity;
import net.minecraft.src.game.level.World;

public class EntityTargetBinaryOperatorXor extends EntityTargetBinaryOperator {
	@Override
	public Entity[] getResult(World world, Entity[] a, Entity[] b) {
		ArrayList<Entity> xorResult = new ArrayList<Entity>();
		for (Entity entityA: a) {
			boolean hasEntity = false;
			for (Entity entityB: b) {
				if (entityA == entityB) {
					hasEntity = true;
					break;
				}
			}
			if (!hasEntity) xorResult.add(entityA);
		}
		for (Entity entityB: b) {
			boolean hasEntity = false;
			for (Entity entityA: a) {
				if (entityA == entityB) {
					hasEntity = true;
					break;
				}
			}
			if (!hasEntity) xorResult.add(entityB);
		}
		return xorResult.toArray(new Entity[] {});
	}
}
