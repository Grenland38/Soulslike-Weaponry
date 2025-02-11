package net.soulsweaponry.client.registry;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.soulsweaponry.client.renderer.entity.mobs.AccursedLordBossRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.BigChungusRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.ChaosMonarchRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.DarkSorcererRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.DayStalkerRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.DraugrBossRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.ForlornRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.FreyrSwordEntityRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.MoonknightRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.NightProwlerRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.NightShadeRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.RemnantRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.ReturningKnightRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.SoulmassRenderer;
import net.soulsweaponry.client.renderer.entity.mobs.WitheredDemonRenderer;
import net.soulsweaponry.client.renderer.entity.projectile.*;
import net.soulsweaponry.registry.EntityRegistry;

public class EntityModelRegistry {
    
    public static void initClient() {
        EntityRendererRegistry.register(EntityRegistry.WITHERED_DEMON, WitheredDemonRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.ACCURSED_LORD_BOSS, AccursedLordBossRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.CHAOS_MONARCH, ChaosMonarchRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DRAUGR_BOSS, DraugrBossRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.NIGHT_SHADE, NightShadeRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.RETURNING_KNIGHT, ReturningKnightRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SOULMASS, SoulmassRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.REMNANT, RemnantRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.FORLORN, ForlornRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.EVIL_FORLORN, ForlornRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DARK_SORCERER, DarkSorcererRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.COMET_SPEAR_ENTITY_TYPE, CometSpearRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.BIG_CHUNGUS, BigChungusRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MOONLIGHT_ENTITY_TYPE, MoonlightProjectileRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MOONLIGHT_BIG_ENTITY_TYPE, MoonlightProjectileBigRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.VERTICAL_MOONLIGHT_ENTITY_TYPE, VerticalMoonlightProjectileRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SWORDSPEAR_ENTITY_TYPE, DragonslayerSwordspearRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.CHARGED_ARROW_ENTITY_TYPE, ChargedArrowRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SILVER_BULLET_ENTITY_TYPE, SilverBulletRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.CANNONBALL, CannonballRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.LEVIATHAN_AXE_ENTITY_TYPE, LeviathanAxeEntityRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MJOLNIR_ENTITY_TYPE, MjolnirProjectileRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.FREYR_SWORD_ENTITY_TYPE, FreyrSwordEntityRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SHADOW_ORB, ShadowOrbRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MOONKNIGHT, MoonknightRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.DRAUPNIR_SPEAR_TYPE, DraupnirSpearEntityRenderer::new);

        EntityRendererRegistry.register(EntityRegistry.DAY_STALKER, DayStalkerRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.NIGHT_PROWLER, NightProwlerRenderer::new);
    }
}
