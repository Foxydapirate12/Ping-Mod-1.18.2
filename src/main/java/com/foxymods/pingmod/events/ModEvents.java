package com.foxymods.pingmod.events;

import com.foxymods.pingmod.PingMod;
import com.foxymods.pingmod.commands.PingCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = PingMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new PingCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }


}
