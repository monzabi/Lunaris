package net.monzabi.lunaris.handle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor(force = true)
@Accessors(fluent = true)
@Getter
public class LunarisHandler {

    private final String version = "1.0-SNAPSHOT";
    private final String prefix = "§8» §cLunaris §8× §7";


}
