package at.wada811.android.material.design.colors.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class ItemListActivity extends FragmentActivity implements ItemListFragment.Callbacks{

    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        if(findViewById(R.id.item_detail_container) != null){
            mTwoPane = true;

            ((ItemListFragment)getSupportFragmentManager().findFragmentById(R.id.item_list)).setActivateOnItemClick(
                true
            );
        }
    }

    @Override
    public void onItemSelected(int position){
        if(mTwoPane){
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
