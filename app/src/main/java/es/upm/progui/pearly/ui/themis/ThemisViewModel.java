package es.upm.progui.pearly.ui.themis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThemisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThemisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is themis fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}