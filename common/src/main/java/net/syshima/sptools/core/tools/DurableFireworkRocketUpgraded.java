package net.syshima.sptools.core.tools;
import net.minecraft.world.item.Item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Fireworks;

import java.util.List;

public class DurableFireworkRocketUpgraded extends DurableFireworkRocket {
    public DurableFireworkRocketUpgraded(Item.Properties settings) {
        super(settings.component(DataComponents.FIREWORKS, new Fireworks(4, List.of())));
    }
}
