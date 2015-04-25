package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorBlueGrey implements MaterialDesignColor{

    BLUE_GREY_50(R.color.md_blue_grey_50, R.string.md_blue_grey_50_color_name, R.string.md_blue_grey_50_color_code, R.color.md_black),
    BLUE_GREY_100(R.color.md_blue_grey_100, R.string.md_blue_grey_100_color_name, R.string.md_blue_grey_100_color_code, R.color.md_black),
    BLUE_GREY_200(R.color.md_blue_grey_200, R.string.md_blue_grey_200_color_name, R.string.md_blue_grey_200_color_code, R.color.md_black),
    BLUE_GREY_300(R.color.md_blue_grey_300, R.string.md_blue_grey_300_color_name, R.string.md_blue_grey_300_color_code, R.color.md_black),
    BLUE_GREY_400(R.color.md_blue_grey_400, R.string.md_blue_grey_400_color_name, R.string.md_blue_grey_400_color_code, R.color.md_white),
    BLUE_GREY_500(R.color.md_blue_grey_500, R.string.md_blue_grey_500_color_name, R.string.md_blue_grey_500_color_code, R.color.md_white),
    BLUE_GREY_600(R.color.md_blue_grey_600, R.string.md_blue_grey_600_color_name, R.string.md_blue_grey_600_color_code, R.color.md_white),
    BLUE_GREY_700(R.color.md_blue_grey_700, R.string.md_blue_grey_700_color_name, R.string.md_blue_grey_700_color_code, R.color.md_white),
    BLUE_GREY_800(R.color.md_blue_grey_800, R.string.md_blue_grey_800_color_name, R.string.md_blue_grey_800_color_code, R.color.md_white),
    BLUE_GREY_900(R.color.md_blue_grey_900, R.string.md_blue_grey_900_color_name, R.string.md_blue_grey_900_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorBlueGrey(int color, int colorName, int colorCode, int textColor) {
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
