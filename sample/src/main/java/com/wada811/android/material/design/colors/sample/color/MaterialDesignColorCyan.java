package com.wada811.android.material.design.colors.sample.color;

import com.wada811.android.material.design.colors.sample.R;

public enum MaterialDesignColorCyan implements MaterialDesignColor{

    CYAN_50(R.color.md_cyan_50, R.string.md_cyan_50_color_name, R.string.md_cyan_50_color_code, R.color.md_black),
    CYAN_100(R.color.md_cyan_100, R.string.md_cyan_100_color_name, R.string.md_cyan_100_color_code, R.color.md_black),
    CYAN_200(R.color.md_cyan_200, R.string.md_cyan_200_color_name, R.string.md_cyan_200_color_code, R.color.md_black),
    CYAN_300(R.color.md_cyan_300, R.string.md_cyan_300_color_name, R.string.md_cyan_300_color_code, R.color.md_black),
    CYAN_400(R.color.md_cyan_400, R.string.md_cyan_400_color_name, R.string.md_cyan_400_color_code, R.color.md_black),
    CYAN_500(R.color.md_cyan_500, R.string.md_cyan_500_color_name, R.string.md_cyan_500_color_code, R.color.md_white),
    CYAN_600(R.color.md_cyan_600, R.string.md_cyan_600_color_name, R.string.md_cyan_600_color_code, R.color.md_white),
    CYAN_700(R.color.md_cyan_700, R.string.md_cyan_700_color_name, R.string.md_cyan_700_color_code, R.color.md_white),
    CYAN_800(R.color.md_cyan_800, R.string.md_cyan_800_color_name, R.string.md_cyan_800_color_code, R.color.md_white),
    CYAN_900(R.color.md_cyan_900, R.string.md_cyan_900_color_name, R.string.md_cyan_900_color_code, R.color.md_white),
    CYAN_A100(R.color.md_cyan_a100, R.string.md_cyan_a100_color_name, R.string.md_cyan_a100_color_code, R.color.md_black),
    CYAN_A200(R.color.md_cyan_a200, R.string.md_cyan_a200_color_name, R.string.md_cyan_a200_color_code, R.color.md_black),
    CYAN_A400(R.color.md_cyan_a400, R.string.md_cyan_a400_color_name, R.string.md_cyan_a400_color_code, R.color.md_black),
    CYAN_A700(R.color.md_cyan_a700, R.string.md_cyan_a700_color_name, R.string.md_cyan_a700_color_code, R.color.md_black),
    ;

    int color;
    int colorName;
    int colorCode;
    int textColor;

    private MaterialDesignColorCyan(int color, int colorName, int colorCode, int textColor) {
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
