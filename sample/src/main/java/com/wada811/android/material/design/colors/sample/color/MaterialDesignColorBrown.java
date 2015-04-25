package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorBrown implements MaterialDesignColor{

    BROWN_50(R.color.md_brown_50, R.string.md_brown_50_color_name, R.string.md_brown_50_color_code, R.color.md_black),
    BROWN_100(R.color.md_brown_100, R.string.md_brown_100_color_name, R.string.md_brown_100_color_code, R.color.md_black),
    BROWN_200(R.color.md_brown_200, R.string.md_brown_200_color_name, R.string.md_brown_200_color_code, R.color.md_black),
    BROWN_300(R.color.md_brown_300, R.string.md_brown_300_color_name, R.string.md_brown_300_color_code, R.color.md_white),
    BROWN_400(R.color.md_brown_400, R.string.md_brown_400_color_name, R.string.md_brown_400_color_code, R.color.md_white),
    BROWN_500(R.color.md_brown_500, R.string.md_brown_500_color_name, R.string.md_brown_500_color_code, R.color.md_white),
    BROWN_600(R.color.md_brown_600, R.string.md_brown_600_color_name, R.string.md_brown_600_color_code, R.color.md_white),
    BROWN_700(R.color.md_brown_700, R.string.md_brown_700_color_name, R.string.md_brown_700_color_code, R.color.md_white),
    BROWN_800(R.color.md_brown_800, R.string.md_brown_800_color_name, R.string.md_brown_800_color_code, R.color.md_white),
    BROWN_900(R.color.md_brown_900, R.string.md_brown_900_color_name, R.string.md_brown_900_color_code, R.color.md_white),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorBrown(int color, int colorName, int colorCode, int textColor) {
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
