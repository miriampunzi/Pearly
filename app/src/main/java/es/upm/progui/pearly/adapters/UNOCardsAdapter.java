package es.upm.progui.pearly.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import es.upm.progui.pearly.fragments.CreateCardFragment;
import es.upm.progui.pearly.listeners.OnClickUNOCardListener;
import es.upm.progui.pearly.R;
import es.upm.progui.pearly.entities.Card_UNO;
import es.upm.progui.pearly.database.Database;

public class UNOCardsAdapter extends RecyclerView.Adapter<UNOCardsAdapter.CardItemViewHolder> {

    private ArrayList<Card_UNO> cards = Database.UNO_CARDS;
    private FragmentActivity fragmentActivity;

    public UNOCardsAdapter(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    @NonNull
    @Override
    public CardItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uno_card, parent, false);
        return new CardItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardItemViewHolder holder, int position) {
        if (cards.get(position).getImageIdResource() != R.drawable.add_card) {
            holder.parentView.setOnClickListener(new OnClickUNOCardListener(cards.get(position), fragmentActivity));
        }
        else {
            holder.parentView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new CreateCardFragment()).addToBackStack(null).commit();
                }
            });
        }

        holder.cardImage.setImageResource(cards.get(position).getImageIdResource());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class CardItemViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout parentView;
        ImageView cardImage;

        public CardItemViewHolder(@NonNull View itemView) {
            super(itemView);

            parentView = itemView.findViewById(R.id.constraintLayout_itemUnoCard);
            cardImage = itemView.findViewById(R.id.imageView_item_card_card);
        }
    }
}
