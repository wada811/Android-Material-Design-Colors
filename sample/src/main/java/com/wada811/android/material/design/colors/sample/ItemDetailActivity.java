package com.wada811.android.material.design.colors.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import com.wada811.android.material.design.colors.sample.color.ColorPalette;
import com.wada811.android.material.design.colors.sample.color.ColorPalette.ColorGroup;
import java.util.Locale;

public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        ActionBar supportActionBar = getSupportActionBar();
        if(supportActionBar != null){
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayUseLogoEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }

        if(savedInstanceState == null){
            int position = getIntent().getIntExtra(com.wada811.android.material.design.colors.sample.ItemDetailFragment.ARG_ITEM_ID, 0);
            ColorGroup color = ColorPalette.ITEMS.get(position);
            String titleText = getResources().getString(color.getColorName());
            int textColor = getResources().getColor(color.getTextColor());
            String htmlColor = String.format(Locale.US, "#%06X", (0xFFFFFF & Color.argb(0, Color.red(textColor), Color.green(textColor), Color.blue(textColor))));
            String titleHtml = "<font color=\"" + htmlColor + "\">" + titleText + "</font>";
            if(supportActionBar != null){
                supportActionBar.setTitle(Html.fromHtml(titleHtml));
                supportActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(color.getColor())));
            }
            Bundle arguments = new Bundle();
            arguments.putInt(com.wada811.android.material.design.colors.sample.ItemDetailFragment.ARG_ITEM_ID, position);
            com.wada811.android.material.design.colors.sample.ItemDetailFragment fragment = new com.wada811.android.material.design.colors.sample.ItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.item_detail_container, fragment).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            NavUtils.navigateUpTo(this, new Intent(this, com.wada811.android.material.design.colors.sample.ItemListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
