package at.wada811.android.material.design.colors.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import java.util.List;
import at.wada811.android.material.design.colors.sample.color.ColorPalette;
import at.wada811.android.material.design.colors.sample.color.MaterialDesignColor;

public class ItemDetailFragment extends ListFragment{

    public static final String ARG_ITEM_ID = "item_id";

    private List<MaterialDesignColor> items;

    public ItemDetailFragment(){
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        if(getArguments().containsKey(ARG_ITEM_ID)){
            MaterialDesignColor color = ColorPalette.ITEMS.get(
                getArguments().getInt(
                    ARG_ITEM_ID
                )
            );
            items = ColorPalette.ITEM_MAP.get(color);

            View view = new View(getActivity());
            getListView().addHeaderView(view);
            setListAdapter(new ItemDetailAdapter(getActivity(), items));
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        getListView().setDivider(null);
        getListView().setDividerHeight(0);
    }
}
