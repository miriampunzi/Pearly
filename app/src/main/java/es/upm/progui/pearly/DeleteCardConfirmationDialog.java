package es.upm.progui.pearly;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import es.upm.progui.pearly.ui.modification.ModificationFragment;

public class DeleteCardConfirmationDialog extends DialogFragment {

    private Card_UNO card;
    private FragmentActivity fragmentActivity;

    public DeleteCardConfirmationDialog(Card_UNO card, FragmentActivity fragmentActivity) {
        this.card = card;
        this.fragmentActivity = fragmentActivity;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Are you sure you want to delete " + card.getName() + "?");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Database.UNO_CARDS.remove(card);
                fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ModificationFragment()).commit();
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        return dialog;
    }

}
