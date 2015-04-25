package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorDeepOrange implements MaterialDesignColor{

    DEEP_ORANGE_50(R.color.md_deep_orange_50, R.string.md_deep_orange_50_color_name, R.string.md_deep_orange_50_color_code, R.color.md_black),
    DEEP_ORANGE_100(R.color.md_deep_orange_100, R.string.md_deep_orange_100_color_name, R.string.md_deep_orange_100_color_code, R.color.md_black),
    DEEP_ORANGE_200(R.color.md_deep_orange_200, R.string.md_deep_orange_200_color_name, R.string.md_deep_orange_200_color_code, R.color.md_black),
    DEEP_ORANGE_300(R.color.md_deep_orange_300, R.string.md_deep_orange_300_color_name, R.string.md_deep_orange_300_color_code, R.color.md_black),
    DEEP_ORANGE_400(R.color.md_deep_orange_400, R.string.md_deep_orange_400_color_name, R.string.md_deep_orange_400_color_code, R.color.md_black),
    DEEP_ORANGE_500(R.color.md_deep_orange_500, R.string.md_deep_orange_500_color_name, R.string.md_deep_orange_500_color_code, R.color.md_white),
    DEEP_ORANGE_600(R.color.md_deep_orange_600, R.string.md_deep_orange_600_color_name, R.string.md_deep_orange_600_color_code, R.color.md_white),
    DEEP_ORANGE_700(R.color.md_deep_orange_700, R.string.md_deep_orange_700_color_name, R.string.md_deep_orange_700_color_code, R.color.md_white),
    DEEP_ORANGE_800(R.color.md_deep_orange_800, R.string.md_deep_orange_800_color_name, R.string.md_deep_orange_800_color_code, R.color.md_white),
    DEEP_ORANGE_900(R.color.md_deep_orange_900, R.string.md_deep_orange_900_color_name, R.string.md_deep_orange_900_color_code, R.color.md_white),
    DEEP_ORANGE_A100(R.color.md_deep_orange_a100, R.string.md_deep_orange_a100_color_name, R.string.md_deep_orange_a100_color_code, R.color.md_black),
    DEEP_ORANGE_A200(R.color.md_deep_orange_a200, R.string.md_deep_orange_a200_color_name, R.string.md_deep_orange_a200_color_code, R.color.md_black),
    DEEP_ORANGE_A400(R.color.md_deep_orange_a400, R.string.md_deep_orange_a400_color_name, R.string.md_deep_orange_a400_color_code, R.color.md_white),
    DEEP_ORANGE_A700(R.color.md_deep_orange_a700, R.string.md_deep_orange_a700_color_name, R.string.md_deep_orange_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorDeepOrange(int color, int colorName, int colorCode, int textColor) {
        this.color = color;
        this.colorName = colorName;
        this.colorCode = colorCode;
        this.textColor = textColor;
    }

    @Override
    public int getColor(){
        return color;
    }

    @Override
    public int getColorCode(){
        return colorCode;
    }

    @Override
    public int getColorName(){
        return colorName;
    }

    @Override
    public int getTextColor(){
        return textColor;
    }
}
