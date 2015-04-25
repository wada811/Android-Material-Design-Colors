package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorTeal implements MaterialDesignColor{

    TEAL_50(R.color.md_teal_50, R.string.md_teal_50_color_name, R.string.md_teal_50_color_code, R.color.md_black),
    TEAL_100(R.color.md_teal_100, R.string.md_teal_100_color_name, R.string.md_teal_100_color_code, R.color.md_black),
    TEAL_200(R.color.md_teal_200, R.string.md_teal_200_color_name, R.string.md_teal_200_color_code, R.color.md_black),
    TEAL_300(R.color.md_teal_300, R.string.md_teal_300_color_name, R.string.md_teal_300_color_code, R.color.md_black),
    TEAL_400(R.color.md_teal_400, R.string.md_teal_400_color_name, R.string.md_teal_400_color_code, R.color.md_black),
    TEAL_500(R.color.md_teal_500, R.string.md_teal_500_color_name, R.string.md_teal_500_color_code, R.color.md_white),
    TEAL_600(R.color.md_teal_600, R.string.md_teal_600_color_name, R.string.md_teal_600_color_code, R.color.md_white),
    TEAL_700(R.color.md_teal_700, R.string.md_teal_700_color_name, R.string.md_teal_700_color_code, R.color.md_white),
    TEAL_800(R.color.md_teal_800, R.string.md_teal_800_color_name, R.string.md_teal_800_color_code, R.color.md_white),
    TEAL_900(R.color.md_teal_900, R.string.md_teal_900_color_name, R.string.md_teal_900_color_code, R.color.md_white),
    TEAL_A100(R.color.md_teal_a100, R.string.md_teal_a100_color_name, R.string.md_teal_a100_color_code, R.color.md_black),
    TEAL_A200(R.color.md_teal_a200, R.string.md_teal_a200_color_name, R.string.md_teal_a200_color_code, R.color.md_black),
    TEAL_A400(R.color.md_teal_a400, R.string.md_teal_a400_color_name, R.string.md_teal_a400_color_code, R.color.md_black),
    TEAL_A700(R.color.md_teal_a700, R.string.md_teal_a700_color_name, R.string.md_teal_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorTeal(int color, int colorName, int colorCode, int textColor) {
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
