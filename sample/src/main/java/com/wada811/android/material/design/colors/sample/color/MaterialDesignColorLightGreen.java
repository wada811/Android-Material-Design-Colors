package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorLightGreen implements MaterialDesignColor{

    LIGHT_GREEN_50(R.color.md_light_green_50, R.string.md_light_green_50_color_name, R.string.md_light_green_50_color_code, R.color.md_black),
    LIGHT_GREEN_100(R.color.md_light_green_100, R.string.md_light_green_100_color_name, R.string.md_light_green_100_color_code, R.color.md_black),
    LIGHT_GREEN_200(R.color.md_light_green_200, R.string.md_light_green_200_color_name, R.string.md_light_green_200_color_code, R.color.md_black),
    LIGHT_GREEN_300(R.color.md_light_green_300, R.string.md_light_green_300_color_name, R.string.md_light_green_300_color_code, R.color.md_black),
    LIGHT_GREEN_400(R.color.md_light_green_400, R.string.md_light_green_400_color_name, R.string.md_light_green_400_color_code, R.color.md_black),
    LIGHT_GREEN_500(R.color.md_light_green_500, R.string.md_light_green_500_color_name, R.string.md_light_green_500_color_code, R.color.md_black),
    LIGHT_GREEN_600(R.color.md_light_green_600, R.string.md_light_green_600_color_name, R.string.md_light_green_600_color_code, R.color.md_black),
    LIGHT_GREEN_700(R.color.md_light_green_700, R.string.md_light_green_700_color_name, R.string.md_light_green_700_color_code, R.color.md_black),
    LIGHT_GREEN_800(R.color.md_light_green_800, R.string.md_light_green_800_color_name, R.string.md_light_green_800_color_code, R.color.md_white),
    LIGHT_GREEN_900(R.color.md_light_green_900, R.string.md_light_green_900_color_name, R.string.md_light_green_900_color_code, R.color.md_white),
    LIGHT_GREEN_A100(R.color.md_light_green_a100, R.string.md_light_green_a100_color_name, R.string.md_light_green_a100_color_code, R.color.md_black),
    LIGHT_GREEN_A200(R.color.md_light_green_a200, R.string.md_light_green_a200_color_name, R.string.md_light_green_a200_color_code, R.color.md_black),
    LIGHT_GREEN_A400(R.color.md_light_green_a400, R.string.md_light_green_a400_color_name, R.string.md_light_green_a400_color_code, R.color.md_black),
    LIGHT_GREEN_A700(R.color.md_light_green_a700, R.string.md_light_green_a700_color_name, R.string.md_light_green_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorLightGreen(int color, int colorName, int colorCode, int textColor) {
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
