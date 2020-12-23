package me.andante.collidable.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Entity.class)
public class EntityMixin {
    /**
     * @author andantedevs
     * @reason for the lols
     */
    @Overwrite
    public boolean isCollidable() {
        return true;
    }
}
