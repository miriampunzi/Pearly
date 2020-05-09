package es.upm.progui.pearly.ui.modification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import es.upm.progui.pearly.Database;
import es.upm.progui.pearly.ListGamesAdapter;
import es.upm.progui.pearly.R;
import es.upm.progui.pearly.UNOCardsAdapter;
import es.upm.progui.pearly.ui.home.HomeViewModel;

public class ModificationFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_modification, container, false);

        RecyclerView UNOCardList = root.findViewById(R.id.recyclerView_fragmentModification_cards);
        UNOCardList.setHasFixedSize(true);
        UNOCardsAdapter adapter = new UNOCardsAdapter();
        UNOCardList.setAdapter(adapter);
        GridLayoutManager UNOCardsLayoutManager = new GridLayoutManager(getContext(), 5);
        UNOCardList.setLayoutManager(UNOCardsLayoutManager);

        return root;
    }
}
