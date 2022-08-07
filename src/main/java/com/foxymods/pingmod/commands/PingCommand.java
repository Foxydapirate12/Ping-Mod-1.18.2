package com.foxymods.pingmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

import javax.crypto.spec.PSource;

public class PingCommand {
    public PingCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("ping").executes((command) -> {
            return 0;
        }));
    }

    private int ping(CommandSource source) throws CommandSyntaxException {

        source.sendMessage("pong");
        return 1;
    }

}
