package net.monzabi.lunairs;

import lombok.Getter;

@Getter
public class LunarisAPI {

    private static LunarisAPI lunarsAPI;

    public LunarisAPI() {
        lunarsAPI = this;
    }

    public static LunarisAPI instance() {
        if (lunarsAPI == null) {
            lunarsAPI = new LunarisAPI();
        }
        return lunarsAPI;
    }

    public String getVersion() {
        return "1.0.0";
    }



}
