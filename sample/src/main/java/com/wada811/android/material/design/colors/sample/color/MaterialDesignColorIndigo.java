package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorIndigo implements MaterialDesignColor{

    INDIGO_50(R.color.md_indigo_50, R.string.md_indigo_50_color_name, R.string.md_indigo_50_color_code, R.color.md_black),
    INDIGO_100(R.color.md_indigo_100, R.string.md_indigo_100_color_name, R.string.md_indigo_100_color_code, R.color.md_black),
    INDIGO_200(R.color.md_indigo_200, R.string.md_indigo_200_color_name, R.string.md_indigo_200_color_code, R.color.md_black),
    INDIGO_300(R.color.md_indigo_300, R.string.md_indigo_300_color_name, R.string.md_indigo_300_color_code, R.color.md_white),
    INDIGO_400(R.color.md_indigo_400, R.string.md_indigo_400_color_name, R.string.md_indigo_400_color_code, R.color.md_white),
    INDIGO_500(R.color.md_indigo_500, R.string.md_indigo_500_color_name, R.string.md_indigo_500_color_code, R.color.md_white),
    INDIGO_600(R.color.md_indigo_600, R.string.md_indigo_600_color_name, R.string.md_indigo_600_color_code, R.color.md_white),
    INDIGO_700(R.color.md_indigo_700, R.string.md_indigo_700_color_name, R.string.md_indigo_700_color_code, R.color.md_white),
    INDIGO_800(R.color.md_indigo_800, R.string.md_indigo_800_color_name, R.string.md_indigo_800_color_code, R.color.md_white),
    INDIGO_900(R.color.md_indigo_900, R.string.md_indigo_900_color_name, R.string.md_indigo_900_color_code, R.color.md_white),
    INDIGO_A100(R.color.md_indigo_a100, R.string.md_indigo_a100_color_name, R.string.md_indigo_a100_color_code, R.color.md_black),
    INDIGO_A200(R.color.md_indigo_a200, R.string.md_indigo_a200_color_name, R.string.md_indigo_a200_color_code, R.color.md_white),
    INDIGO_A400(R.color.md_indigo_a400, R.string.md_indigo_a400_color_name, R.string.md_indigo_a400_color_code, R.color.md_white),
    INDIGO_A700(R.color.md_indigo_a700, R.string.md_indigo_a700_color_name, R.string.md_indigo_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorIndigo(int color, int colorName, int colorCode, int textColor) {
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
