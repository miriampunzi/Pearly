package es.upm.progui.pearly;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UNOCardsAdapter extends RecyclerView.Adapter<UNOCardsAdapter.CardItemViewHolder> {

    private ArrayList<Card_UNO> cards = Database.UNO_CARDS;

    @NonNull
    @Override
    public CardItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uno_card, parent, false);
        return new CardItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardItemViewHolder holder, int position) {
        holder.cardImage.setImageResource(cards.get(position).getImageIdResource());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class CardItemViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImage;

        public CardItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.imageView_item_card_card);
        }
    }
}
