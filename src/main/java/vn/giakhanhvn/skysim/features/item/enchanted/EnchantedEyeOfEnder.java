/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.features.item.enchanted;

import vn.giakhanhvn.skysim.features.item.GenericItemType;
import vn.giakhanhvn.skysim.features.item.MaterialFunction;
import vn.giakhanhvn.skysim.features.item.MaterialStatistics;
import vn.giakhanhvn.skysim.features.item.Rarity;

public class EnchantedEyeOfEnder
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Enchanted Eye of Ender";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }
}
