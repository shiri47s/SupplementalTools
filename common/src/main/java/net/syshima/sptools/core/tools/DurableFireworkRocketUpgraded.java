package net.syshima.sptools.core.tools;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FireworksComponent;

import java.util.List;

public class DurableFireworkRocketUpgraded extends DurableFireworkRocket {
    public DurableFireworkRocketUpgraded(Settings settings) {
        super(settings.component(DataComponentTypes.FIREWORKS, new FireworksComponent(4, List.of())));
    }
}
