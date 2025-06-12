package net.monzabi.lunaris.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.server.Packet;
import net.minecraft.server.PacketPlayInCustomPayload;
import net.minecraft.server.PlayerConnection;

public class Networking extends NetworkHandler {

    @Override
    public void handlePacket(PlayerConnection playerConnection, Packet<?> packet) {
        if (packet instanceof PacketPlayInCustomPayload) {
            final PacketPlayInCustomPayload packetPlayInCustomPayload = (PacketPlayInCustomPayload) packet;
            final String channel = packetPlayInCustomPayload.a();

            if (channel.equals("MC|BEdit") || channel.equals("MC|BSign") || channel.equals("MC|BOpen")) {
                playerConnection.getNetworkManager().close(
                        new net.minecraft.server.ChatMessage("§cBooks are disabled!"));
                return;
            }

        }
    }

    @Override
    protected void handleByteBuf(ByteBuf byteBuf) {

    }
}
