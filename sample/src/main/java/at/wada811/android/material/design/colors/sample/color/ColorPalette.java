package at.wada811.android.material.design.colors.sample.color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import at.wada811.android.material.design.colors.sample.R;

public class ColorPalette{

    public static List<ColorGroup> ITEMS = new ArrayList<ColorGroup>();
    public static Map<ColorGroup, List<MaterialDesignColor>> ITEM_MAP = new HashMap<ColorGroup, List<MaterialDesignColor>>();

    static{
        addItem(
            new ColorGroup(R.color.md_red_500, R.string.md_red, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorRed.values())
        );
        addItem(
            new ColorGroup(R.color.md_pink_500, R.string.md_pink, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorPink.values())
        );
        addItem(
            new ColorGroup(R.color.md_purple_500, R.string.md_purple, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorPurple.values())
        );
        addItem(
            new ColorGroup(R.color.md_deep_purple_500, R.string.md_deep_purple, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorDeepPurple.values())
        );
        addItem(
            new ColorGroup(R.color.md_indigo_500, R.string.md_indigo, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorIndigo.values())
        );
        addItem(
            new ColorGroup(R.color.md_blue_500, R.string.md_blue, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorBlue.values())
        );
        addItem(
            new ColorGroup(R.color.md_light_blue_500, R.string.md_light_blue, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorLightBlue.values())
        );
        addItem(
            new ColorGroup(R.color.md_cyan_500, R.string.md_cyan, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorCyan.values())
        );
        addItem(
            new ColorGroup(R.color.md_teal_500, R.string.md_teal, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorTeal.values())
        );
        addItem(
            new ColorGroup(R.color.md_green_500, R.string.md_green, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorGreen.values())
        );
        addItem(
            new ColorGroup(R.color.md_light_green_500, R.string.md_light_green, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorLightGreen.values())
        );
        addItem(
            new ColorGroup(R.color.md_lime_500, R.string.md_lime, R.color.md_black),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorLime.values())
        );
        addItem(
            new ColorGroup(R.color.md_yellow_500, R.string.md_yellow, R.color.md_black),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorYellow.values())
        );
        addItem(
            new ColorGroup(R.color.md_amber_500, R.string.md_amber, R.color.md_black),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorAmber.values())
        );
        addItem(
            new ColorGroup(R.color.md_orange_500, R.string.md_orange, R.color.md_black),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorOrange.values())
        );
        addItem(
            new ColorGroup(R.color.md_deep_orange_500, R.string.md_deep_orange, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorDeepOrange.values())
        );
        addItem(
            new ColorGroup(R.color.md_brown_500, R.string.md_brown, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorBrown.values())
        );
        addItem(
            new ColorGroup(R.color.md_grey_500, R.string.md_grey, R.color.md_black),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorGrey.values())
        );
        addItem(
            new ColorGroup(R.color.md_blue_grey_500, R.string.md_blue_grey, R.color.md_white),
            Arrays.<MaterialDesignColor>asList(MaterialDesignColorBlueGrey.values())
        );
    }

    public static void addItem(ColorGroup group, List<MaterialDesignColor> list){
        ITEMS.add(group);
        ITEM_MAP.put(group, list);
    }

    public static class ColorGroup {

        int color;
        int colorName;
        int textColor;

        private ColorGroup(int color, int colorName, int textColor) {
            this.color = color;
            this.colorName = colorName;
            this.textColor = textColor;
        }

        public int getColor(){
            return color;
        }

        public int getColorName(){
            return colorName;
        }

        public int getTextColor(){
            return textColor;
        }
    }

}
