package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorRed implements MaterialDesignColor{

    RED_50(R.color.md_red_50, R.string.md_red_50_color_name, R.string.md_red_50_color_code, R.color.md_black),
    RED_100(R.color.md_red_100, R.string.md_red_100_color_name, R.string.md_red_100_color_code, R.color.md_black),
    RED_200(R.color.md_red_200, R.string.md_red_200_color_name, R.string.md_red_200_color_code, R.color.md_black),
    RED_300(R.color.md_red_300, R.string.md_red_300_color_name, R.string.md_red_300_color_code, R.color.md_black),
    RED_400(R.color.md_red_400, R.string.md_red_400_color_name, R.string.md_red_400_color_code, R.color.md_black),
    RED_500(R.color.md_red_500, R.string.md_red_500_color_name, R.string.md_red_500_color_code, R.color.md_white),
    RED_600(R.color.md_red_600, R.string.md_red_600_color_name, R.string.md_red_600_color_code, R.color.md_white),
    RED_700(R.color.md_red_700, R.string.md_red_700_color_name, R.string.md_red_700_color_code, R.color.md_white),
    RED_800(R.color.md_red_800, R.string.md_red_800_color_name, R.string.md_red_800_color_code, R.color.md_white),
    RED_900(R.color.md_red_900, R.string.md_red_900_color_name, R.string.md_red_900_color_code, R.color.md_white),
    RED_A100(R.color.md_red_a100, R.string.md_red_a100_color_name, R.string.md_red_a100_color_code, R.color.md_black),
    RED_A200(R.color.md_red_a200, R.string.md_red_a200_color_name, R.string.md_red_a200_color_code, R.color.md_white),
    RED_A400(R.color.md_red_a400, R.string.md_red_a400_color_name, R.string.md_red_a400_color_code, R.color.md_white),
    RED_A700(R.color.md_red_a700, R.string.md_red_a700_color_name, R.string.md_red_a700_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorRed(int color, int colorName, int colorCode, int textColor) {
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
