package com.autovw.burgermod.datagen.providers;

import com.autovw.burgermod.core.registry.ModItems;
import com.autovw.burgermod.core.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput pack, CompletableFuture<HolderLookup.Provider> registries, CompletableFuture<TagLookup<Block>> blockTagsProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pack, registries, blockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        /* Tags added by the mod */
        tag(ModTags.BEEF_BURGERS)
                .add(ModItems.BEEF_BURGER.get())
                .add(ModItems.BEEF_CHEESE_BURGER.get())
                .add(ModItems.BEEF_CHAMPIGNON_BURGER.get());

        tag(ModTags.PORK_BURGERS)
                .add(ModItems.PORK_BURGER.get())
                .add(ModItems.PORK_CHEESE_BURGER.get())
                .add(ModItems.PORK_CHAMPIGNON_BURGER.get());

        tag(ModTags.MUTTON_BURGERS)
                .add(ModItems.MUTTON_BURGER.get())
                .add(ModItems.MUTTON_CHEESE_BURGER.get())
                .add(ModItems.MUTTON_CHAMPIGNON_BURGER.get());

        tag(ModTags.CHICKEN_BURGERS)
                .add(ModItems.CHICKEN_BURGER.get())
                .add(ModItems.CHICKEN_CHEESE_BURGER.get())
                .add(ModItems.CHICKEN_CHAMPIGNON_BURGER.get());

        tag(ModTags.SALMON_BURGERS)
                .add(ModItems.SALMON_BURGER.get())
                .add(ModItems.SALMON_CHEESE_BURGER.get())
                .add(ModItems.SALMON_CHAMPIGNON_BURGER.get());

        tag(ModTags.COD_BURGERS)
                .add(ModItems.COD_BURGER.get())
                .add(ModItems.COD_CHEESE_BURGER.get())
                .add(ModItems.COD_CHAMPIGNON_BURGER.get());

        tag(ModTags.CHEESE_BURGERS)
                .add(ModItems.BEEF_CHEESE_BURGER.get())
                .add(ModItems.PORK_CHEESE_BURGER.get())
                .add(ModItems.MUTTON_CHEESE_BURGER.get())
                .add(ModItems.CHICKEN_CHEESE_BURGER.get())
                .add(ModItems.SALMON_CHEESE_BURGER.get())
                .add(ModItems.COD_CHEESE_BURGER.get());

        tag(ModTags.CHAMPIGNON_BURGERS)
                .add(ModItems.BEEF_CHAMPIGNON_BURGER.get())
                .add(ModItems.PORK_CHAMPIGNON_BURGER.get())
                .add(ModItems.MUTTON_CHAMPIGNON_BURGER.get())
                .add(ModItems.CHICKEN_CHAMPIGNON_BURGER.get())
                .add(ModItems.SALMON_CHAMPIGNON_BURGER.get())
                .add(ModItems.COD_CHAMPIGNON_BURGER.get());

        tag(ModTags.EGG_BURGERS)
                .add(ModItems.BEEF_BURGER.get())
                .add(ModItems.PORK_BURGER.get())
                .add(ModItems.MUTTON_BURGER.get())
                .add(ModItems.CHICKEN_BURGER.get())
                .add(ModItems.SALMON_BURGER.get())
                .add(ModItems.COD_BURGER.get());

        tag(ModTags.GOLDEN_BURGERS)
                .add(ModItems.GOLDEN_BEEF_BURGER.get())
                .add(ModItems.GOLDEN_PORK_BURGER.get())
                .add(ModItems.GOLDEN_MUTTON_BURGER.get())
                .add(ModItems.GOLDEN_CHICKEN_BURGER.get())
                .add(ModItems.GOLDEN_SALMON_BURGER.get())
                .add(ModItems.GOLDEN_COD_BURGER.get());

        tag(ModTags.BURGERS)
                .addTag(ModTags.CHAMPIGNON_BURGERS)
                .addTag(ModTags.CHEESE_BURGERS)
                .addTag(ModTags.EGG_BURGERS);

        /* Forge tags */
        tag(Tags.Items.NUGGETS)
                .addTag(ModTags.FORGE_NUGGETS_CHICKEN);

        tag(ModTags.FORGE_NUGGETS_CHICKEN)
                .add(ModItems.COOKED_CHICKEN_NUGGET.get());

        tag(ModTags.FORGE_CHEESE)
                .add(ModItems.CHEESE.get());

        tag(ModTags.FORGE_FRIED_EGG)
                .add(ModItems.FRIED_SCRAMBLED_EGG.get());

        tag(ModTags.FORGE_COOKED_MUSHROOM)
                .add(ModItems.COOKED_CHAMPIGNONS.get());

        tag(ModTags.FORGE_BREAD)
                .add(Items.BREAD);

        /* Minecraft tags */
        tag(ItemTags.PIGLIN_LOVED)
                .addTag(ModTags.GOLDEN_BURGERS)
                .add(ModItems.ENCHANTED_GOLDEN_BURGER.get());

        tag(ItemTags.MEAT)
                .add(ModItems.COOKED_CHICKEN_NUGGET.get());

        tag(ItemTags.WOLF_FOOD)
                .addTag(ModTags.BEEF_BURGERS)
                .addTag(ModTags.PORK_BURGERS)
                .addTag(ModTags.MUTTON_BURGERS)
                .addTag(ModTags.CHICKEN_BURGERS)
                .add(ModItems.FRIED_SCRAMBLED_EGG.get())
                .add(ModItems.HOTDOG.get());
    }
}
