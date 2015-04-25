package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorYellow implements MaterialDesignColor{

    YELLOW_50(R.color.md_yellow_50, R.string.md_yellow_50_color_name, R.string.md_yellow_50_color_code, R.color.md_black),
    YELLOW_100(R.color.md_yellow_100, R.string.md_yellow_100_color_name, R.string.md_yellow_100_color_code, R.color.md_black),
    YELLOW_200(R.color.md_yellow_200, R.string.md_yellow_200_color_name, R.string.md_yellow_200_color_code, R.color.md_black),
    YELLOW_300(R.color.md_yellow_300, R.string.md_yellow_300_color_name, R.string.md_yellow_300_color_code, R.color.md_black),
    YELLOW_400(R.color.md_yellow_400, R.string.md_yellow_400_color_name, R.string.md_yellow_400_color_code, R.color.md_black),
    YELLOW_500(R.color.md_yellow_500, R.string.md_yellow_500_color_name, R.string.md_yellow_500_color_code, R.color.md_black),
    YELLOW_600(R.color.md_yellow_600, R.string.md_yellow_600_color_name, R.string.md_yellow_600_color_code, R.color.md_black),
    YELLOW_700(R.color.md_yellow_700, R.string.md_yellow_700_color_name, R.string.md_yellow_700_color_code, R.color.md_black),
    YELLOW_800(R.color.md_yellow_800, R.string.md_yellow_800_color_name, R.string.md_yellow_800_color_code, R.color.md_black),
    YELLOW_900(R.color.md_yellow_900, R.string.md_yellow_900_color_name, R.string.md_yellow_900_color_code, R.color.md_black),
    YELLOW_A100(R.color.md_yellow_a100, R.string.md_yellow_a100_color_name, R.string.md_yellow_a100_color_code, R.color.md_black),
    YELLOW_A200(R.color.md_yellow_a200, R.string.md_yellow_a200_color_name, R.string.md_yellow_a200_color_code, R.color.md_black),
    YELLOW_A400(R.color.md_yellow_a400, R.string.md_yellow_a400_color_name, R.string.md_yellow_a400_color_code, R.color.md_black),
    YELLOW_A700(R.color.md_yellow_a700, R.string.md_yellow_a700_color_name, R.string.md_yellow_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorYellow(int color, int colorName, int colorCode, int textColor) {
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
