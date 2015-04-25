package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorPurple implements MaterialDesignColor{

    PURPLE_50(R.color.md_purple_50, R.string.md_purple_50_color_name, R.string.md_purple_50_color_code, R.color.md_black),
    PURPLE_100(R.color.md_purple_100, R.string.md_purple_100_color_name, R.string.md_purple_100_color_code, R.color.md_black),
    PURPLE_200(R.color.md_purple_200, R.string.md_purple_200_color_name, R.string.md_purple_200_color_code, R.color.md_black),
    PURPLE_300(R.color.md_purple_300, R.string.md_purple_300_color_name, R.string.md_purple_300_color_code, R.color.md_white),
    PURPLE_400(R.color.md_purple_400, R.string.md_purple_400_color_name, R.string.md_purple_400_color_code, R.color.md_white),
    PURPLE_500(R.color.md_purple_500, R.string.md_purple_500_color_name, R.string.md_purple_500_color_code, R.color.md_white),
    PURPLE_600(R.color.md_purple_600, R.string.md_purple_600_color_name, R.string.md_purple_600_color_code, R.color.md_white),
    PURPLE_700(R.color.md_purple_700, R.string.md_purple_700_color_name, R.string.md_purple_700_color_code, R.color.md_white),
    PURPLE_800(R.color.md_purple_800, R.string.md_purple_800_color_name, R.string.md_purple_800_color_code, R.color.md_white),
    PURPLE_900(R.color.md_purple_900, R.string.md_purple_900_color_name, R.string.md_purple_900_color_code, R.color.md_white),
    PURPLE_A100(R.color.md_purple_a100, R.string.md_purple_a100_color_name, R.string.md_purple_a100_color_code, R.color.md_black),
    PURPLE_A200(R.color.md_purple_a200, R.string.md_purple_a200_color_name, R.string.md_purple_a200_color_code, R.color.md_white),
    PURPLE_A400(R.color.md_purple_a400, R.string.md_purple_a400_color_name, R.string.md_purple_a400_color_code, R.color.md_white),
    PURPLE_A700(R.color.md_purple_a700, R.string.md_purple_a700_color_name, R.string.md_purple_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorPurple(int color, int colorName, int colorCode, int textColor) {
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
