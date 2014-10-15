package at.wada811.android.material.design.colors.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;
import at.wada811.android.material.design.colors.sample.color.ColorPalette;

public class ItemListFragment extends ListFragment{

    private static final String STATE_ACTIVATED_POSITION = "activated_position";

    private Callbacks mCallbacks = sDummyCallbacks;

    private int mActivatedPosition = ListView.INVALID_POSITION;

    public interface Callbacks{

        public void onItemSelected(int position);
    }

    private static Callbacks sDummyCallbacks = new Callbacks(){
        @Override
        public void onItemSelected(int position){
        }
    };

    public ItemListFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setListAdapter(new ItemListAdapter(getActivity(), ColorPalette.ITEMS));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        getListView().setDivider(null);
        getListView().setDividerHeight(0);

        if(savedInstanceState != null && savedInstanceState.containsKey(STATE_ACTIVATED_POSITION)){
            setActivatedPosition(savedInstanceState.getInt(STATE_ACTIVATED_POSITION));
        }
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        // Activities containing this fragment must implement its callbacks.
        if(activity instanceof Callbacks == false){
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }
        mCallbacks = (Callbacks)activity;
    }

    @Override
    public void onDetach(){
        super.onDetach();

        mCallbacks = sDummyCallbacks;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        super.onListItemClick(listView, view, position, id);
        mCallbacks.onItemSelected(position);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(mActivatedPosition != ListView.INVALID_POSITION){
            outState.putInt(STATE_ACTIVATED_POSITION, mActivatedPosition);
        }
    }

    public void setActivateOnItemClick(boolean activateOnItemClick){
        getListView().setChoiceMode(
            activateOnItemClick ? ListView.CHOICE_MODE_SINGLE : ListView.CHOICE_MODE_NONE
        );
    }

    private void setActivatedPosition(int position){
        if(position == ListView.INVALID_POSITION){
            getListView().setItemChecked(mActivatedPosition, false);
        }else{
            getListView().setItemChecked(position, true);
        }
        mActivatedPosition = position;
    }
}
