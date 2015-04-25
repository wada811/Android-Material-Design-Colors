package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorPink implements MaterialDesignColor{

    PINK_50(R.color.md_pink_50, R.string.md_pink_50_color_name, R.string.md_pink_50_color_code, R.color.md_black),
    PINK_100(R.color.md_pink_100, R.string.md_pink_100_color_name, R.string.md_pink_100_color_code, R.color.md_black),
    PINK_200(R.color.md_pink_200, R.string.md_pink_200_color_name, R.string.md_pink_200_color_code, R.color.md_black),
    PINK_300(R.color.md_pink_300, R.string.md_pink_300_color_name, R.string.md_pink_300_color_code, R.color.md_black),
    PINK_400(R.color.md_pink_400, R.string.md_pink_400_color_name, R.string.md_pink_400_color_code, R.color.md_black),
    PINK_500(R.color.md_pink_500, R.string.md_pink_500_color_name, R.string.md_pink_500_color_code, R.color.md_white),
    PINK_600(R.color.md_pink_600, R.string.md_pink_600_color_name, R.string.md_pink_600_color_code, R.color.md_white),
    PINK_700(R.color.md_pink_700, R.string.md_pink_700_color_name, R.string.md_pink_700_color_code, R.color.md_white),
    PINK_800(R.color.md_pink_800, R.string.md_pink_800_color_name, R.string.md_pink_800_color_code, R.color.md_white),
    PINK_900(R.color.md_pink_900, R.string.md_pink_900_color_name, R.string.md_pink_900_color_code, R.color.md_white),
    PINK_A100(R.color.md_pink_a100, R.string.md_pink_a100_color_name, R.string.md_pink_a100_color_code, R.color.md_black),
    PINK_A200(R.color.md_pink_a200, R.string.md_pink_a200_color_name, R.string.md_pink_a200_color_code, R.color.md_white),
    PINK_A400(R.color.md_pink_a400, R.string.md_pink_a400_color_name, R.string.md_pink_a400_color_code, R.color.md_white),
    PINK_A700(R.color.md_pink_a700, R.string.md_pink_a700_color_name, R.string.md_pink_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorPink(int color, int colorName, int colorCode, int textColor) {
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
