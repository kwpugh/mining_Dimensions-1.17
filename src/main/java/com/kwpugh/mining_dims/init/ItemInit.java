package com.kwpugh.mining_dims.init;

import com.kwpugh.mining_dims.MiningDims;
import com.kwpugh.mining_dims.items.CavingTeleporter;
import com.kwpugh.mining_dims.items.HuntingTeleporter;
import com.kwpugh.mining_dims.items.MiningTeleporter;
import com.kwpugh.mining_dims.items.NetheringTeleporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
    static boolean mining = MiningDims.CONFIG.GENERAL.enableMiningTeleporter;
    static boolean hunting = MiningDims.CONFIG.GENERAL.enableHuntingTeleporter;
    static boolean caving = MiningDims.CONFIG.GENERAL.enableCavingTeleporter;
    static boolean nethering = MiningDims.CONFIG.GENERAL.enableNetheringTeleporter;

    public static final Item MINING_TELEPORTER = new MiningTeleporter(new Item.Settings().group(ItemGroup.MISC));
    public static final Item HUNTING_TELEPORTER = new HuntingTeleporter(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CAVING_TELEPORTER = new CavingTeleporter(new Item.Settings().group(ItemGroup.MISC));
    public static final Item NETHERING_TELEPORTER = new NetheringTeleporter(new Item.Settings().group(ItemGroup.MISC));

    public static void init()
    {
        if(mining)
        {
            Registry.register(Registry.ITEM, new Identifier(MiningDims.MOD_ID, "mining_teleporter"), MINING_TELEPORTER);
        }

        if(hunting)
        {
            Registry.register(Registry.ITEM, new Identifier(MiningDims.MOD_ID, "hunting_teleporter"), HUNTING_TELEPORTER);
        }

        if(caving)
        {
            Registry.register(Registry.ITEM, new Identifier(MiningDims.MOD_ID, "caving_teleporter"), CAVING_TELEPORTER);
        }

        if(nethering)
        {
            Registry.register(Registry.ITEM, new Identifier(MiningDims.MOD_ID, "nethering_teleporter"), NETHERING_TELEPORTER);
        }
    }
}