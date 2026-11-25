package micdoodle8.mods.galacticraft.core.client.gui.tabs;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Vanilla inventory tab, vendored from Tinkers' Construct's client tab API so Galacticraft no longer needs TiC on the
 * classpath.
 */
public class InventoryTabVanilla extends AbstractTab {

    public InventoryTabVanilla() {
        super(0, 0, 0, new ItemStack(Blocks.crafting_table));
    }

    @Override
    public void onTabClicked() {
        TabRegistry.openInventoryGui();
    }

    @Override
    public boolean shouldAddToList() {
        return true;
    }

    @Override
    protected void drawUnselectedTabDecorations(Minecraft mc, int textureXOffset, int textureYStart, int tabTopY,
            int tabHeight) {
        int textureX = textureXOffset * 28;
        int sourceY = 29;
        int targetY = tabTopY + tabHeight;

        // Extend the bottom-left corner on the unselected vanilla tab.
        // 0,29 -> two extra pixels down; 1,29 -> one extra pixel down.
        this.drawTexturedModalRect(this.xPosition, targetY, textureX, sourceY, 1, 1);
        this.drawTexturedModalRect(this.xPosition, targetY + 1, textureX, sourceY, 1, 1);
        this.drawTexturedModalRect(this.xPosition + 1, targetY, textureX + 1, sourceY, 1, 1);
    }
}
