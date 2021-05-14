package io.github.chaosawakens.items;

import io.github.chaosawakens.config.CAConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.HoeItem;
import net.minecraft.world.World;

public class EnchantedHoeItem extends HoeItem {

    private final int[] enchantmentLevels;
    private final Enchantment[] enchantmentIds;

    public EnchantedHoeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn, Enchantment[] enchants, int[] lvls) {
        super(tier,attackDamageIn,attackSpeedIn,builderIn);
        enchantmentIds = enchants;
        enchantmentLevels = lvls;
    }

    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        if (!CAConfig.COMMON.enableAutoEnchanting.get()) return;
        for (int i = 0; i < enchantmentIds.length; i++) {
            stack.addEnchantment(enchantmentIds[i], enchantmentLevels[i]);
        }
    }

    public void inventoryTick(ItemStack stack, World worldInD, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!CAConfig.COMMON.enableAutoEnchanting.get()) return;
        if (EnchantmentHelper.getEnchantmentLevel(enchantmentIds[0],stack) <= 0) {
            for (int i = 0; i < enchantmentIds.length; i++) {
                stack.addEnchantment(enchantmentIds[i], enchantmentLevels[i]);
            }
        }
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}