package es.upm.progui.pearly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UNOCardsAdapter extends RecyclerView.Adapter<UNOCardsAdapter.CardItemViewHolder> {

    private ArrayList<Card_UNO> cards = Database.UNO_CARDS;
    private FragmentActivity fragmentActivity;

    public UNOCardsAdapter(FragmentActivity fragmentActivity) {
        if (cards.get(0).getImageIdResource() != R.drawable.add_card)
            cards.add(0, new Card_UNO(R.drawable.add_card, null, false, -1, null, null, null));
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
        if (cards.get(position).getImageIdResource() == R.drawable.add_card) {
            holder.deleteButton.setVisibility(View.GONE);
            holder.editButton.setVisibility(View.GONE);
        }

        holder.cardImage.setImageResource(cards.get(position).getImageIdResource());
        holder.deleteButton.setOnClickListener(new OnDeleteCardClickListener(cards.get(position), fragmentActivity));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class CardItemViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImage;
        ImageButton editButton, deleteButton;

        public CardItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.imageView_item_card_card);
            editButton = itemView.findViewById(R.id.imageButton_itemUnoCard_editButton);
            deleteButton = itemView.findViewById(R.id.imageButton_itemUnoCard_deleteButton);
        }
    }
}
