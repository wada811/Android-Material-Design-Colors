package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorLightBlue implements MaterialDesignColor{

    LIGHT_BLUE_50(R.color.md_light_blue_50, R.string.md_light_blue_50_color_name, R.string.md_light_blue_50_color_code, R.color.md_black),
    LIGHT_BLUE_100(R.color.md_light_blue_100, R.string.md_light_blue_100_color_name, R.string.md_light_blue_100_color_code, R.color.md_black),
    LIGHT_BLUE_200(R.color.md_light_blue_200, R.string.md_light_blue_200_color_name, R.string.md_light_blue_200_color_code, R.color.md_black),
    LIGHT_BLUE_300(R.color.md_light_blue_300, R.string.md_light_blue_300_color_name, R.string.md_light_blue_300_color_code, R.color.md_black),
    LIGHT_BLUE_400(R.color.md_light_blue_400, R.string.md_light_blue_400_color_name, R.string.md_light_blue_400_color_code, R.color.md_black),
    LIGHT_BLUE_500(R.color.md_light_blue_500, R.string.md_light_blue_500_color_name, R.string.md_light_blue_500_color_code, R.color.md_white),
    LIGHT_BLUE_600(R.color.md_light_blue_600, R.string.md_light_blue_600_color_name, R.string.md_light_blue_600_color_code, R.color.md_white),
    LIGHT_BLUE_700(R.color.md_light_blue_700, R.string.md_light_blue_700_color_name, R.string.md_light_blue_700_color_code, R.color.md_white),
    LIGHT_BLUE_800(R.color.md_light_blue_800, R.string.md_light_blue_800_color_name, R.string.md_light_blue_800_color_code, R.color.md_white),
    LIGHT_BLUE_900(R.color.md_light_blue_900, R.string.md_light_blue_900_color_name, R.string.md_light_blue_900_color_code, R.color.md_white),
    LIGHT_BLUE_A100(R.color.md_light_blue_a100, R.string.md_light_blue_a100_color_name, R.string.md_light_blue_a100_color_code, R.color.md_black),
    LIGHT_BLUE_A200(R.color.md_light_blue_a200, R.string.md_light_blue_a200_color_name, R.string.md_light_blue_a200_color_code, R.color.md_black),
    LIGHT_BLUE_A400(R.color.md_light_blue_a400, R.string.md_light_blue_a400_color_name, R.string.md_light_blue_a400_color_code, R.color.md_black),
    LIGHT_BLUE_A700(R.color.md_light_blue_a700, R.string.md_light_blue_a700_color_name, R.string.md_light_blue_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorLightBlue(int color, int colorName, int colorCode, int textColor) {
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
