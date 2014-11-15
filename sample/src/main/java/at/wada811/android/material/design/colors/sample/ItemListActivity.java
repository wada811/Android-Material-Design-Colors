package at.wada811.android.material.design.colors.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import java.util.Locale;
import at.wada811.android.material.design.colors.sample.color.ColorPalette;
import at.wada811.android.material.design.colors.sample.color.ColorPalette.ColorGroup;


public class ItemListActivity extends ActionBarActivity implements ItemListFragment.Callbacks{

    private boolean isTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        isTwoPane = getResources().getBoolean(R.bool.isTwoPane);
        setContentView(isTwoPane ? R.layout.activity_item_twopane : R.layout.activity_item_list);

        if(isTwoPane){
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            getSupportActionBar().setDisplayUseLogoEnabled(false);

            ((ItemListFragment)getSupportFragmentManager().findFragmentById(R.id.item_list)).setActivateOnItemClick(
                true
            );
            onItemSelected(0);
        }
    }

    @Override
    public void onItemSelected(int position){
        if(isTwoPane){

            ColorGroup color = ColorPalette.ITEMS.get(position);
            String titleText = getResources().getString(color.getColorName());
            int textColor = getResources().getColor(color.getTextColor());
            int hexColor = (0xFFFFFF & Color.argb(0, Color.red(textColor), Color.green(textColor), Color.blue(textColor)));
            String htmlColor = String.format(Locale.US, "#%06X", hexColor);
            String titleHtml = "<font color=\"" + htmlColor + "\">" + titleText + "</font>";
            getSupportActionBar().setTitle(Html.fromHtml(titleHtml));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(color.getColor())));


            Bundle arguments = new Bundle();
            arguments.putInt(ItemDetailFragment.ARG_ITEM_ID, position);
            ItemDetailFragment fragment = new ItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.item_detail_container, fragment)
                .commit();

        }else{
            Intent detailIntent = new Intent(this, ItemDetailActivity.class);
            detailIntent.putExtra(ItemDetailFragment.ARG_ITEM_ID, position);
            startActivity(detailIntent);
        }
    }
}
