package ridleydyne.ridleydynelibrary;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("ridleydynelibrary")
public class RidleyDyneLibrary
{
    public RidleyDyneLibrary() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
