package dqu.additionaladditions.enchantment;

import dqu.additionaladditions.config.Config;
import dqu.additionaladditions.config.ConfigValues;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.NotNull;

public class SpeedEnchantment extends Enchantment {
    public SpeedEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR_LEGS, new EquipmentSlot[] {EquipmentSlot.LEGS});
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isDiscoverable() {
        return Config.getBool(ConfigValues.ENCHANTMENT_SPEED);
    }

    @Override
    public boolean isTradeable() {
        return Config.getBool(ConfigValues.ENCHANTMENT_SPEED);
    }
}
