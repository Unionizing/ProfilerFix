package club.unionizing.profilerfix.mixin;

import net.minecraft.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mixin(Profiler.class)
public class MixinProfiler {

    /**
     * @author unionizing
     * @reason block startSection
     */
    @Overwrite
    public void startSection(String name) {};

    /**
     * @author unionizing
     * @reason block endStartSection
     */
    @Overwrite
    public void endStartSection(String name) {};

    /**
     * @author unionizing
     * @reason block getNameOfLastSection
     */
    @Overwrite
    public String getNameOfLastSection() {
        return "[UNKNOWN]";
    };

    /**
     * @author unionizing
     * @reason block getProfilingData
     */
    @Overwrite
    public List getProfilingData(String unused) {
        return new ArrayList<Profiler.Result>(Arrays.asList(new Profiler.Result("root", 0.0, 0.0)));
    };

    /**
     * @author unionizing
     * @reason block clearProfiling
     */
    @Overwrite
    public void clearProfiling() {};

    /**
     * @author unionizing
     * @reason block endSection
     */
    @Overwrite
    public void endSection() {};
}
