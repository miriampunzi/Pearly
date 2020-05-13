package es.upm.progui.pearly.fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.database.Database;
import es.upm.progui.pearly.entities.Card_UNO;

public class CreateCardFragment extends Fragment {

    ImageView newCard;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View createCardView = inflater.inflate(R.layout.fragment_create_card, container, false);

        newCard = createCardView.findViewById(R.id.imageView_fragmentCreateCard_trollFaceCard);

        Button addImageButton = createCardView.findViewById(R.id.button_fragmentCreateCard_addImage);
        addImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pickPhoto = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(pickPhoto, 1);
            }
        });

        final Button createButton = createCardView.findViewById(R.id.button_fragmentCreateCard_create);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Database.UNO_CARDS.add(1, new Card_UNO(R.drawable.troll_card, "Troll Card", false, -1, null, "BLACK", null));
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ModificationFragment()).commit();
            }
        });

        final EditText cardRuleEditText = createCardView.findViewById(R.id.editText_dialogCreateCard_cardRule);
        cardRuleEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardRuleEditText.setText("Joker card that can be any card. This means that it can act as a “normal” card, which means everything but Skip, Reverse,Draw 2, Draw 4.");
                createButton.setEnabled(true);
            }
        });
        cardRuleEditText.setShowSoftInputOnFocus(false);

        final EditText cardNameEditText = createCardView.findViewById(R.id.editText_dialogCreateCard_cardName);
        cardNameEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardNameEditText.setText("Troll Card");
            }
        });
        cardNameEditText.setShowSoftInputOnFocus(false);

        return createCardView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            newCard.setImageResource(R.drawable.troll_card);
        }
    }
}


