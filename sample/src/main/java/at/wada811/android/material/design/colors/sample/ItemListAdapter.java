package at.wada811.android.material.design.colors.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import at.wada811.android.material.design.colors.sample.color.MaterialDesignColor;

public class ItemListAdapter extends BindableAdapter<MaterialDesignColor>{

    public ItemListAdapter(Context context, List<MaterialDesignColor> items){
        super(context, items);
    }

    @Override
    public View newView(LayoutInflater inflater, int position, ViewGroup container){
        View view = inflater.inflate(R.layout.list_item_list, container, false);
        ViewHolder holder = new ViewHolder(view);
        view.setTag(holder);
        return view;
    }

    @Override
    public void bindView(MaterialDesignColor item, int position, View view){
        ViewHolder holder = (ViewHolder)view.getTag();
        holder.item.setBackgroundColor(getContext().getResources().getColor(item.getColor()));
        holder.name.setText(item.getColorName());
        holder.name.setTextColor(getContext().getResources().getColor(item.getTextColor()));
    }

    private class ViewHolder{

        RelativeLayout item;
        TextView name;

        public ViewHolder(View view){
            item = (RelativeLayout)view.findViewById(R.id.item);
            name = (TextView)view.findViewById(R.id.name);
        }
    }
}
