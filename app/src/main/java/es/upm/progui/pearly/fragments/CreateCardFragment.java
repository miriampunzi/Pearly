package es.upm.progui.pearly.fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import es.upm.progui.pearly.R;

public class CreateCardFragment extends Fragment {

    ImageView newCard;

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


