package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorLime implements MaterialDesignColor{

    LIME_50(R.color.md_lime_50, R.string.md_lime_50_color_name, R.string.md_lime_50_color_code, R.color.md_black),
    LIME_100(R.color.md_lime_100, R.string.md_lime_100_color_name, R.string.md_lime_100_color_code, R.color.md_black),
    LIME_200(R.color.md_lime_200, R.string.md_lime_200_color_name, R.string.md_lime_200_color_code, R.color.md_black),
    LIME_300(R.color.md_lime_300, R.string.md_lime_300_color_name, R.string.md_lime_300_color_code, R.color.md_black),
    LIME_400(R.color.md_lime_400, R.string.md_lime_400_color_name, R.string.md_lime_400_color_code, R.color.md_black),
    LIME_500(R.color.md_lime_500, R.string.md_lime_500_color_name, R.string.md_lime_500_color_code, R.color.md_black),
    LIME_600(R.color.md_lime_600, R.string.md_lime_600_color_name, R.string.md_lime_600_color_code, R.color.md_black),
    LIME_700(R.color.md_lime_700, R.string.md_lime_700_color_name, R.string.md_lime_700_color_code, R.color.md_black),
    LIME_800(R.color.md_lime_800, R.string.md_lime_800_color_name, R.string.md_lime_800_color_code, R.color.md_black),
    LIME_900(R.color.md_lime_900, R.string.md_lime_900_color_name, R.string.md_lime_900_color_code, R.color.md_white),
    LIME_A100(R.color.md_lime_a100, R.string.md_lime_a100_color_name, R.string.md_lime_a100_color_code, R.color.md_black),
    LIME_A200(R.color.md_lime_a200, R.string.md_lime_a200_color_name, R.string.md_lime_a200_color_code, R.color.md_black),
    LIME_A400(R.color.md_lime_a400, R.string.md_lime_a400_color_name, R.string.md_lime_a400_color_code, R.color.md_black),
    LIME_A700(R.color.md_lime_a700, R.string.md_lime_a700_color_name, R.string.md_lime_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorLime(int color, int colorName, int colorCode, int textColor) {
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
