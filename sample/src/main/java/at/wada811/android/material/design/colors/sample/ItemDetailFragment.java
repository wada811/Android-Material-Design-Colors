package at.wada811.android.material.design.colors.sample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;
import java.util.List;
import at.wada811.android.material.design.colors.sample.color.ColorPalette;
import at.wada811.android.material.design.colors.sample.color.ColorPalette.ColorGroup;
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
            ColorGroup color = ColorPalette.ITEMS.get(getArguments().getInt(ARG_ITEM_ID));
            List<MaterialDesignColor> items = ColorPalette.ITEM_MAP.get(color);

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

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        super.onListItemClick(listView, view, position, id);
        MaterialDesignColor color = items.get(position);
        copyText(getActivity(), getString(color.getColorCode()));
    }

    public void copyText(Context context, String text){
        if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB){
            android.text.ClipboardManager clipboard = (android.text.ClipboardManager)context.getSystemService(
                Context.CLIPBOARD_SERVICE
            );
            clipboard.setText(text);
        }else{
            android.content.ClipboardManager clipboard = (android.content.ClipboardManager)context.getSystemService(
                Context.CLIPBOARD_SERVICE
            );
            android.content.ClipData clip = android.content.ClipData.newPlainText(
                "Copied Text", text
            );
            clipboard.setPrimaryClip(clip);
        }
    }

}
