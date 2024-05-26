package club.unionizing.profilerfix;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "Profiler Fix", useMetadata=true)
public class ProfilerFix {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[Profiler Fix] FMLInitializationEvent called.");
    }
}
