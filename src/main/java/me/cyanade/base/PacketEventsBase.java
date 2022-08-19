package me.cyanade.base;

import io.github.retrooper.packetevents.PacketEvents;
import io.github.retrooper.packetevents.utils.server.ServerVersion;
import lombok.Getter;
import me.cyanade.base.util.PacketAPIListener;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class PacketEventsBase extends JavaPlugin {

    @Getter private static PacketEventsBase instance;

    @Override
    public void onEnable() {

        instance = this;

        PacketEvents.create(this);
        PacketEvents.get().getSettings()
                .fallbackServerVersion(ServerVersion.v_1_8)
                .compatInjector(false)
                .checkForUpdates(false);
        PacketEvents.get().load();
        PacketEvents.get().init();

        PacketEvents.get().registerListener(new PacketAPIListener());
    }
}
