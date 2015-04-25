package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorGrey implements MaterialDesignColor{

    GREY_50(R.color.md_grey_50, R.string.md_grey_50_color_name, R.string.md_grey_50_color_code, R.color.md_black),
    GREY_100(R.color.md_grey_100, R.string.md_grey_100_color_name, R.string.md_grey_100_color_code, R.color.md_black),
    GREY_200(R.color.md_grey_200, R.string.md_grey_200_color_name, R.string.md_grey_200_color_code, R.color.md_black),
    GREY_300(R.color.md_grey_300, R.string.md_grey_300_color_name, R.string.md_grey_300_color_code, R.color.md_black),
    GREY_400(R.color.md_grey_400, R.string.md_grey_400_color_name, R.string.md_grey_400_color_code, R.color.md_black),
    GREY_500(R.color.md_grey_500, R.string.md_grey_500_color_name, R.string.md_grey_500_color_code, R.color.md_black),
    GREY_600(R.color.md_grey_600, R.string.md_grey_600_color_name, R.string.md_grey_600_color_code, R.color.md_white),
    GREY_700(R.color.md_grey_700, R.string.md_grey_700_color_name, R.string.md_grey_700_color_code, R.color.md_white),
    GREY_800(R.color.md_grey_800, R.string.md_grey_800_color_name, R.string.md_grey_800_color_code, R.color.md_white),
    GREY_900(R.color.md_grey_900, R.string.md_grey_900_color_name, R.string.md_grey_900_color_code, R.color.md_white),
    BLACK(R.color.md_black, R.string.md_black_color_name, R.string.md_black_color_code, R.color.md_white),
    WHITE(R.color.md_white, R.string.md_white_color_name, R.string.md_white_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorGrey(int color, int colorName, int colorCode, int textColor) {
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
