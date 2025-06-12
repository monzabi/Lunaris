package net.monzabi.lunaris.network;

public enum NetworkState {

    RECEIVING,
    SENDING;

    public boolean isReceiving() {
        return this == RECEIVING;
    }

    public boolean isSending() {
        return this == SENDING;
    }

}
