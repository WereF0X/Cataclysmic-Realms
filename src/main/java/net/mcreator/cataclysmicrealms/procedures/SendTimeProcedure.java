package net.mcreator.cataclysmicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import java.util.Calendar;

public class SendTimeProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(new java.text.SimpleDateFormat("The current time is" + "yyyy-MM-dd").format(Calendar.getInstance().getTime())), false);
	}
}
