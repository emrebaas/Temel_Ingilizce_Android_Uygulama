import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ingilizceogreniyorum.temelingilizce.R;

import static com.ingilizceogreniyorum.temelingilizce.R.layout.fragment_menu_alt;

/**
 * Created by emre on 24.03.2017.
 */

public class Fragmentmanualt extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(fragment_menu_alt,container,false);


    }
}
