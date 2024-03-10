package net.taureon.tauexample.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method = "getBaseRepairCost()I", at = @At("RETURN"), cancellable = true)
    public void getBaseRepairCost(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}