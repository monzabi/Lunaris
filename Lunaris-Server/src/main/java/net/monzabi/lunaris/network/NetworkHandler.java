package net.monzabi.lunaris.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.server.Packet;
import net.minecraft.server.PlayerConnection;

public abstract class NetworkHandler {

    protected abstract void handlePacket(PlayerConnection playerConnection, Packet<?> packet);

    protected abstract void handleByteBuf(final ByteBuf byteBuf);

}
