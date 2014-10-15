package at.wada811.android.material.design.colors.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.MenuItem;
import java.util.Locale;
import at.wada811.android.material.design.colors.sample.color.ColorPalette;
import at.wada811.android.material.design.colors.sample.color.MaterialDesignColor;

public class ItemDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState == null) {
            int position = getIntent().getIntExtra(ItemDetailFragment.ARG_ITEM_ID, 0);
            MaterialDesignColor color = ColorPalette.ITEMS.get(position);
            String titleText = getResources().getString(color.getColorName());
            int textColor = getResources().getColor(color.getTextColor());
            String htmlColor = String.format(Locale.US, "#%06X", (0xFFFFFF & Color.argb(0, Color.red(textColor), Color.green(textColor), Color.blue(textColor))));
            String titleHtml = "<font color=\"" + htmlColor +  "\">" + titleText + "</font>";
            getSupportActionBar().setTitle(Html.fromHtml(titleHtml));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(color.getColor())));

            Bundle arguments = new Bundle();
            arguments.putInt(ItemDetailFragment.ARG_ITEM_ID, position);
            ItemDetailFragment fragment = new ItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpTo(this, new Intent(this, ItemListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
