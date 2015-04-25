package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorAmber implements MaterialDesignColor{

    AMBER_50(R.color.md_amber_50, R.string.md_amber_50_color_name, R.string.md_amber_50_color_code, R.color.md_black),
    AMBER_100(R.color.md_amber_100, R.string.md_amber_100_color_name, R.string.md_amber_100_color_code, R.color.md_black),
    AMBER_200(R.color.md_amber_200, R.string.md_amber_200_color_name, R.string.md_amber_200_color_code, R.color.md_black),
    AMBER_300(R.color.md_amber_300, R.string.md_amber_300_color_name, R.string.md_amber_300_color_code, R.color.md_black),
    AMBER_400(R.color.md_amber_400, R.string.md_amber_400_color_name, R.string.md_amber_400_color_code, R.color.md_black),
    AMBER_500(R.color.md_amber_500, R.string.md_amber_500_color_name, R.string.md_amber_500_color_code, R.color.md_black),
    AMBER_600(R.color.md_amber_600, R.string.md_amber_600_color_name, R.string.md_amber_600_color_code, R.color.md_black),
    AMBER_700(R.color.md_amber_700, R.string.md_amber_700_color_name, R.string.md_amber_700_color_code, R.color.md_black),
    AMBER_800(R.color.md_amber_800, R.string.md_amber_800_color_name, R.string.md_amber_800_color_code, R.color.md_black),
    AMBER_900(R.color.md_amber_900, R.string.md_amber_900_color_name, R.string.md_amber_900_color_code, R.color.md_black),
    AMBER_A100(R.color.md_amber_a100, R.string.md_amber_a100_color_name, R.string.md_amber_a100_color_code, R.color.md_black),
    AMBER_A200(R.color.md_amber_a200, R.string.md_amber_a200_color_name, R.string.md_amber_a200_color_code, R.color.md_black),
    AMBER_A400(R.color.md_amber_a400, R.string.md_amber_a400_color_name, R.string.md_amber_a400_color_code, R.color.md_black),
    AMBER_A700(R.color.md_amber_a700, R.string.md_amber_a700_color_name, R.string.md_amber_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorAmber(int color, int colorName, int colorCode, int textColor) {
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
