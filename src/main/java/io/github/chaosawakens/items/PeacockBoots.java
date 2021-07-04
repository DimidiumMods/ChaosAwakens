package io.github.chaosawakens.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PeacockBoots extends ArmorItem {
    public PeacockBoots(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, EquipmentSlot.FEET, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof  LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            if (livingEntity.getEquippedStack(EquipmentSlot.FEET) == stack) {
                if (!livingEntity.isOnGround()) livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 60, 0, false, false));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
