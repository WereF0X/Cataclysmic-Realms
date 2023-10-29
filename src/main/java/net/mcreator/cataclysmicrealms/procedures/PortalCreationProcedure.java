package net.mcreator.cataclysmicrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.common.ToolActions;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PortalCreationProcedure {
	@SubscribeEvent
	public static void onUseHoe(BlockEvent.BlockToolModificationEvent event) {
		if (!event.isSimulated() && event.getToolAction() == ToolActions.HOE_TILL) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
