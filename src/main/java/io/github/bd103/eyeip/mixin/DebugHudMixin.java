package io.github.bd103.eyeip.mixin;

import io.github.bd103.eyeip.EyeIP;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import java.util.List;

@Mixin(DebugHud.class)
public abstract class DebugHudMixin {
    @Inject(
            method = "drawLeftText",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/hud/DebugHud;getLeftText()Ljava/util/List;",
                    shift = At.Shift.BY,
                    by = 2
            ),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void drawLeftText(DrawContext context, CallbackInfo ci, List<String> list) {
        list.add("[EyeIP] Address: " + EyeIP.currentAddress);
    }
}
