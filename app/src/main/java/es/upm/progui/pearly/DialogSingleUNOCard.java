package es.upm.progui.pearly;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import es.upm.progui.pearly.ui.modification.ModificationFragment;

public class DialogSingleUNOCard extends DialogFragment {

    private Card_UNO card;
    private FragmentActivity fragmentActivity;

    public DialogSingleUNOCard(Card_UNO card, FragmentActivity fragmentActivity) {
        this.card = card;
        this.fragmentActivity = fragmentActivity;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View singleUNOCardView = inflater.inflate(R.layout.dialog_single_card, null);

        ImageView cardImage = singleUNOCardView.findViewById(R.id.imageView_dialogSingleCard_cardImage);
        cardImage.setImageResource(card.getImageIdResource());

        builder.setTitle(card.getName());

        builder.setNeutralButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setPositiveButton("Edit Card", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Delete card", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

                DeleteCardConfirmationDialog deleteCardConfirmationDialog = new DeleteCardConfirmationDialog(card, fragmentActivity);
                deleteCardConfirmationDialog.show(fragmentActivity.getSupportFragmentManager(), "DELETE DIALOG");
            }
        });

        builder.setView(singleUNOCardView);

        AlertDialog dialog = builder.create();
        return dialog;
    }

}
