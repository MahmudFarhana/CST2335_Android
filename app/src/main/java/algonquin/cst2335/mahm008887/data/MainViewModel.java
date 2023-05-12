package algonquin.cst2335.mahm008887.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel{
        public static LiveData<Object> isChecked;
        public MutableLiveData<String> editString = new MutableLiveData<>();
        public MutableLiveData<Boolean> editChecked = new MutableLiveData<>();
        public String theText;

}
